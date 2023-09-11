package tut01;

public class CharEX {

	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
		char c = 'a';
		String str = "b";
		int ch = 'a';
		
		System.out.println(c);
		System.out.println(str);
		System.out.println((char)100);
		
		System.out.println("-------------------------");
		
		//회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "koreait";
		String passwd = "01234";
		
		//내가 지금 입력한 아이디, 비밀번호
		String userid2 = "seoul";
		String passwd2 ="31234";

		String userid3 = "koreait";
		String passwd3 = "01234";

		//값이 같냐 다르냐 A.equals("b") A와 B의 값이 같으면
		//확인 => if -> 맞으면 로그인 되었습니다. 틀리면 다시 로그인해 주세요
		
//		if(userid == userid2) {
//			System.out.println("로그인이 되었습니다.");
//		}else {
//			System.out.println("다시 로그인해 주세요");
//		}
		
		if(!userid.equals(userid2)) {//userid userid2 같지 않으면
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("가입된 회원이 아닙니다. \n회원가입 해주세요.");
		}
		
		System.out.println("----------------------------");
		
		//성별 : M, F
		
		//회원가입에 저장된 성별
		char g = 'M';
		
		//로그인할 때 입력하는 성별
		char g2 = 'M';
		
		if(g==g2) {	
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("가입된 회원이 아닙니다. \n회원가입 해주세요.");
		}
		
		
		
		
	}

}
