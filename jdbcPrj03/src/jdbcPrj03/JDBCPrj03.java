package jdbcPrj03;

import java.sql.*;

class DBDao {
	void insertDB() throws Exception { // i/o
		/*
		1. 연결 - Connection 객체
		2. 쿼리실행 : Statement
		3. 결과 출력 : ResultSet()
		*/
		
		Connection conn = null;
		Statement stmt = null; 
		
		//Class.forName()
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://127.0.0.1:3306/grp";
		String uid = "root";
		String pwd = "1234";
		
		//접속 정보
		conn = DriverManager.getConnection(url, uid, pwd);
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전 작업
		
		//쿼리 실행
		String sql = "INSERT INTO member VALUES(null,'대구아이티',now(),now());";
		
		stmt.execute(sql);
		
		
		System.out.println("Insert Completed..");
		
		
		//Comment 출력
		
		
		
	}
}


public class JDBCPrj03 {

	public static void main(String[] args) throws Exception {
		DBDao dao = new DBDao();
		
		dao.insertDB();
		
	}

}
