package jdbcPrj04;

import java.sql.*;

class insertDao {

	void selectDB()	{
		 
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/shop";
				String uid = "root";
				String pwd = "1234";
				
				conn = DriverManager.getConnection(url,uid,pwd);
				
				String sql = "SELECT * FROM items ORDER BY item_id DESC";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					//인덱스 1이 item id?? 0부터 시작안하노
					System.out.print(rs.getInt(1)+" ");
					System.out.print(rs.getString(2)+" ");
					System.out.print(rs.getInt(3)+" ");
					System.out.print(rs.getInt(4)+" ");
					System.out.println(rs.getDate(5)+" ");
					
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	
	void insertDB() {
		 
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url,uid,pwd);
			
			String sql = "INSERT INTO items VALUES(NULL,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			
			//1:첫번째 물음표 2:두번째물음표 3:세번째 물음표 >> 물음표 인덱스네
			pstmt.setString(1, "컴퓨터 LG 모니터");
			pstmt.setInt(2, 250000);
			pstmt.setInt(3, 40);
			
			int row = pstmt.executeUpdate();
			if(row > 0) {
				System.out.println(row);
				System.out.println("상품 등록이 완료 되었습니다.");
			}else {
				System.out.println(row);
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//인덱스 0부터 시작하는거 머고 ->> LIMIT쓸때 인덱스 0부터 시작하는걸로 썻네
	
	
	
}

public class JDBCPrj06 {

	public static void main(String[] args) {
		insertDao dao = new insertDao();
		//dao.insertDB();
		dao.selectDB();

	}

}
