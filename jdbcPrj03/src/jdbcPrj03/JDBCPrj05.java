package jdbcPrj03;

import java.sql.*;

class UpdateDao {
	
	
	void updateDB() {
		try {
			Connection conn = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/grp";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url,uid,pwd);
			
			String sql = "UPDATE member SET com_name = '부산아이티' WHERE com_id = 1";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);	//값이 바뀌면 1 안바뀌면 0
			
			if(result > 0) 
				System.out.println("회원 정보가 수정 되었습니다.");
			else
				System.out.println("관리자에 문의하세요.");
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("연결 실패.");
		}
	}
}

class DeleteDao {
	
	void deleteDB()	{
		try {
			Connection conn = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/grp";
			String uid = "root";
			String pwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url,uid,pwd);
			String sql = "DELETE FROM member WHERE com_id = 4";
			
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
			
			if (row > 0)
				System.out.println("사원 정보가 삭제되었습니다.");
			else
				System.out.println("삭제할 수 없습니다. \n관리자에 문의하세요.");
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("연결 실패.");
		}
	}
}

public class JDBCPrj05 {

	public static void main(String[] args) {
//		UpdateDao dao = new UpdateDao();
//		dao.updateDB();
		
		DeleteDao dao = new DeleteDao();
		dao.deleteDB();
		
		

	}

}
