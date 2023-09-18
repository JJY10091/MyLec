package tut03;


public class SwitchEx {

	public static void main(String[] args) {
		//대, 소문자 값을 처리
		//char 
		//A/a -> 골드회원, B/b -> 실버회원, 그 외는 Guest 
		
		char grade = 'B';
		
		//switch : 문자, 문자열, 정수 o -> 비교연산자 x
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("골드회원입니다.");
			break;
		
		case 'B' :
		case 'b' :
			System.out.println("실버회원입니다.");
			break;
			
		default:
			System.out.println("Guest입니다.");
			break;
		}
	}
}
