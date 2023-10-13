package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) throws IOException  {

//		ClassNotFoundEx~
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("데이터베이스 연결 성공");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace(); //예가 발생 부분 표시 : 개발자
//			e.getMessage(); // 예외 메시지 
//			System.out.println("404 Error : 관리자에게 문의하세요.");
//		
//		}finally { //예외가 생기든 말든 무조건 실행, finally사용 안해도됨
//			
//			/* 위에서 DB를 사용한경우 rs부터 conn순서대로 닫음 
//			rs.close();
//			pstmt.close();
//			conn.closs()
//			*/
//		}
		
		
//		FileNotFoundEx~
		
//		try {
//			FileInputStream fis = new FileInputStream("./koreait.txt");
//			fis.read();
//			
//		} catch (FileNotFoundException e) {
//			//e.printStackTrace();
//			//e.getMessage();
//			System.out.println("404 Error : 관리자에게 문의하세요.");
//		}finally {
//			System.out.println("종료합니다.");
//		}
		
//		try {
//			System.out.println(10/0);
//		}catch(ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
//		String[] str = new String[] {"ab","bc","cd"};
		
//		try {
//			System.out.println(str[3]);
//		}catch(ArrayIndexOutOfBoundsException aiobe) {
//			//aiobe.printStackTrace();
//			System.out.println("인덱스 번호 예회");
//		}
		
//		String str = "Koreait";
//		String str2 = null;
//		//글자 추출 후 char로 변경
//		
//		System.out.println(str.charAt(0));
//		
//		
//		try {
//			System.out.println(str2.charAt(0));
//		}catch(NullPointerException npe) {
//			npe.printStackTrace();
//			System.out.println("데이터 값이 없습니다.");
//		}

	}

}
