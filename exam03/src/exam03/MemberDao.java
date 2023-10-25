package exam03;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DBConnect db = DBConnect.getInstance();
	
	int menu() {
		
		System.out.println("========== kordb 회원관리 시스템 =========");
		System.out.println("   1.회원목록  |  2.회원등록  |  3.종료");
		System.out.println("=====================================");
		
		System.out.print("선택(1 ~ 3) : ");
		int choice = sc.nextInt();
		
		System.out.println("");
		return choice;
	}
	
	List<Member> getMember() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("         1.회원목록");
		System.out.println("-----------------------------");
		
		List<Member> list = new ArrayList<>();
		
		conn = db.getConnection();
		String sql = "SELECT * FROM kordb_member;";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		
		while (rs.next()) {
			Member m = new Member();
			m.setMemId(rs.getInt(1));
			m.setMemName(rs.getString(2));
			m.setMemPwd(rs.getString(3));
			m.setMemRegDate(rs.getString(4));
			m.setMemGender(rs.getString(5));
			m.setMemIntro(rs.getString(6));
			
			list.add(m);
			System.out.println("");
		}
		
		return list;
	}
	
	int setMember() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("         2.회원등록");
		System.out.println("-----------------------------");
		
		conn = db.getConnection();
		String sql = "INSERT INTO kordb_member VALUES(NULL, ?, ?, now(), ?, ?);";
		
		Member nm = new Member();
		
		System.out.print("이름 : ");
		nm.setMemName(sc.next());
		
		System.out.print("비밀번호 : ");
		nm.setMemPwd(sc.next());
		
		System.out.print("성별 : ");
		nm.setMemGender(sc.next());
		
		System.out.print("자기소개 : ");
		nm.setMemIntro(sc.next());
		
		
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nm.getMemName());
		pstmt.setString(2, nm.getMemPwd());
		
		pstmt.setString(3, nm.getMemGender());
		pstmt.setString(4, nm.getMemIntro());
		
		int result = pstmt.executeUpdate();
		
		return result;
			
	}
	
	void disconnect() {
		System.out.println("-----------------------------");
		System.out.println("      프로그램을 종료합니다. ");
		System.out.println("-----------------------------");
		System.exit(0);
	}
	
	
	
	
}
