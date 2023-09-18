package tut04;

public class HelloEx {

	
//	
//	//매개변수는 있을 수도 있고 없을 수도
//	//접근제한자 : public(아무나) private(나만 변경가능 : 캡슐화)
//	//sysout(리턴타입->void), sysout(타입)
//	
//	public void disp(String title) {
//		System.out.println(title+" 아카데미 객체");
//	}
//	
//	
	public static void main(String[] args) {
		//단순 출력 
		System.out.println("코리아아이티 아카데미");
		
		//클래스명 이름 = new 클래스명();
		//disp()메소드가 있는 클래스명을 사용한다
//		HelloEx he = new HelloEx(); 
//		he.disp();
		
		//매개변수 사용해서 문자열을 바꿔보기
		HelloEx he = new HelloEx();
		
		//매게변수에서 보낼 때 값 -> 받을 때는 타입 변수
//		he.disp("부산"); //메소드를 동적으로 처리하기 위해
//		he.disp("서울");
	}
}
