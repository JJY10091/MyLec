package jdbcPrj04;

import java.sql.*;
class ItemCrud {
	
	void selectItem() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String uid = "root";
		String pwd = "1234";
		//접속 정보
		conn = DriverManager.getConnection(url, uid, pwd);
		String sql = "SELECT * FROM items ORDER BY item_id DESC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { //디비 -> 객체 -> 화면 출력 -> 자료마다 item 객체를 생성하네
			Items item = new Items(); 
			
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2)); 
			item.setItemPrice(rs.getInt(3)); 
			item.setItemStock(rs.getInt(4)); 
			item.setItemDate(rs.getString(5)); 
			
			System.out.println(item.toString());
			
		}
	}
	
	
	
	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt = null; 
				
		try {
			
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, pwd);
			
			String sql ="INSERT INTO items VALUES(NULL,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);

//			pstmt.setString(1, "물건"); // >>> 이부분을 객체를 사용해서 넣어보자

			Items item = new Items();
			item.setItemName("신상품");
			item.setItemPrice(100000);
			item.setItemStock(500);
			
			//1,2,3 인덱스가 위에 sql에 VALUES ()안에 ?,?,? 순서임 1부터 시작
			pstmt.setString(1, item.getItemName());
			pstmt.setInt(2, item.getItemPrice());
			pstmt.setInt(3, item.getItemStock());
		
			int row = pstmt.executeUpdate();
			
			if(row > 0) {
				System.out.println(item.getItemName() + "상품 등록이 완료되었습니다.");
			}else
				System.out.println("상품 등록에 실패하였습니다. \n확인하세요.");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
}

public class ItemsEx {

	public static void main(String[] args) throws Exception {
		ItemCrud crud = new ItemCrud();
		//crud.insertItem();
		crud.selectItem();
		
	}

}
