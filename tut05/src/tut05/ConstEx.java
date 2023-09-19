package tut05;
//방 = 객체 = 클래스

class Const {
	
	//여러 생성자 (오버로딩) 
	//this로 중복되는 코드를 줄인다
	
	public Const(String str) {
		System.out.println(str);
	}	
	public Const(String str, String tel) {
		this(str);
		System.out.println(tel);
	}
	public Const(String str, String tel, String addr) {
		this(str,tel);
		System.out.println(addr);
	}  		
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public String close(String str) {
		return str;
	}
}

public class ConstEx {

	public static void main(String[] args) {
		//======코리아아이티 계산기 Ver1.0====== 생성자
		//정수 + 정수 = 정수 메소드 
		//프로그램 종료 - 메소드
		
		Const cal = new Const("======코리아아이티 계산기 Ver1.0======");
		System.out.println(cal.add(300, 500)); 
		System.out.println(cal.close("프로그램 종료")); 

		System.out.println("---------------------------");
		//코리아아이티, 전화번호
		Const seoul = new Const("코리아아이티 계산기 Ver1.0","051-223-2221");
		
		System.out.println("---------------------------");
		//코리아아이티, 전화번호, addr
		Const gwangju = new Const("코리아아이티 계산기 Ver1.0","051-223-2221","광주");
		
	}
}
















