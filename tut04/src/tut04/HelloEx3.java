package tut04;

public class HelloEx3 {
	/*	
	접근제한 리터 메소드() { //이것만으로 화면 출력 x
		return 값;
	}
	*/
	public String title(String addr) {
		return addr;
	}
	public static void main(String[] args) {
		
		HelloEx3 he = new HelloEx3(); //클래스 안에 메소드 가려오려면..
		
		System.out.println(he.title("부산 아카데미"));
		
		System.out.println(he.title("서울 코리아아카데미"));
		
		System.out.println(he.title("광주 Koreait"));
		
	}
}
