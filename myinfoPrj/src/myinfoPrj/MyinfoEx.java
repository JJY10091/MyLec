package myinfoPrj;

import java.sql.*;

class Myinfo{
	private String userid;
	private String passwd;
	private int age;
	
	public Myinfo() {
		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Myinfo [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	
	
}
class InsertDB{
	
	void selectQuery() throws Exception {
		//연결, 쿼리실행, 결과출력
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id  = "root";
		String pwd = "1234";
		
		//접속에 필요한 드라이버
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pwd);
		
		String query = "SELECT * FROM myinfo ORDER BY userid ASC";
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();  //쿼리 실행은 executeQuery , 수정,추가,변경은 executeUpdate();
		
		while(rs.next()) {
//			System.out.println("아이디 : "+rs.getString(1)+", "
//							+ "비밀번호 : "+rs.getString(2)+", "
//							+ "나이 : "+rs.getInt(3));
			
			//객체 이용해서 위와 동일한 결과 출력
			Myinfo m = new Myinfo();
			m.setUserid(rs.getString(1));
			m.setPasswd(rs.getString(2));
			m.setAge(rs.getInt(3));
			
			System.out.println(m.toString()); 
		}
		
	}
	
	
	void insertQuery() {
		//연결(Connection), SQL실행(PreparedStatement), (결과출력)
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		//입출력 => try catch 써야댐
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id  = "root";
			String pwd = "1234";
			
			//접속에 필요한 드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pwd);
			
			String sql = "INSERT INTO myinfo VALUES(?,?,?);"; // ? 는 변수
			pstmt = conn.prepareStatement(sql);
			
			/* 이부분을 객체 지향으로 바꿔본다
			pstmt.setString(1, "koreait"); 
			pstmt.setString(2, "1234");
			pstmt.setInt(3, 20);
			 */
			
			Myinfo my = new Myinfo();
			my.setUserid("seoulit");
			my.setPasswd("4537");
			my.setAge(30);
			
			pstmt.setString(1, my.getUserid()); 
			pstmt.setString(2, my.getPasswd());
			pstmt.setInt(3, my.getAge());
			
			
			//위에 직접 입력한 것과 동일
			
			int row = pstmt.executeUpdate();
			
			if (row > 0)
				System.out.println(my.getUserid() + "님 회원가입이 완료 되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}


public class MyinfoEx {

	public static void main(String[] args) throws Exception {
		InsertDB db = new InsertDB();
		//db.insertQuery();
		db.selectQuery();
		
		
	}

}

















