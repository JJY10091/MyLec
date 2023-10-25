package exam03;

import java.sql.*;

public class DBConnect {

	private static DBConnect db = new DBConnect();
	
	private DBConnect() {}
	
	public static DBConnect getInstance() {
		return db;
	}
	
	Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/kordb";
		String uid = "kordb";
		String pwd = "1234";
	
		Connection conn = DriverManager.getConnection(url,uid,pwd);
	
		return conn;
	}
	
	
}
