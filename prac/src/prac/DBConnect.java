package prac;

import java.sql.*;

public class DBConnect {
	
	
	Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url= "jdbc:mysql://localhost:3306/examdb";
			String uid= "root";
			String pwd= "1234";
			
			Connection conn = DriverManager.getConnection(url,uid,pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
