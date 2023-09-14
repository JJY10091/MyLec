package tut01;

public class StringEx3 {

	public static void main(String[] args) {
		
		//같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 - 배열[] + for문 같이 사용
		//다른 타입을 다루기 위해서는 객체로 데이터를 다룬다 - for사용
		
		
		//소문자 -> 대문자
		//값.toUpperCase();
		String title = "korea it academy";
		System.out.println(title.toUpperCase());
		
		System.out.println("--------------------------");
		
		String menus = "Home:Company:Contact";
		
		//System.out.println(menus.split(":")); //배열이라 메모리주소로 나옴
		
		String[] s = menus.split(":");
		
		System.out.println(s[0]);

		
		//일반 for문
		for(int i = 0; i < s.length; ++i) {
			System.out.println(s[i]);
		}
		
		//**향상된 for문 => 유지보수 쉽다** 
//		for(데이터타입 별명 : 배열이름) {
//			출력코드(별명)
//		}
		
//		for(String result : s) {
//			System.out.println(result);
//		}
		
		System.out.println(s.length);
		
		System.out.println("------------------------------");
		
		//정수 생성 후 초기값은 100
		//출력 : 생성된 변수의 초기값은 100입니다.
		
		int num = 100;
		System.out.println("초기값" + num + "입니다.");
		
		System.out.printf("생성된 변수의 초기값은 %d입니다.\n",num);
		
		String str = "부산";
		
//		2진수 -> bibary 	=> 01010101
//		8진수 -> Oct		=> 01 010 101
//		16진수 -> hex	=> 0101 1010 -> 0~9,a(10),b,c,d,e,f(15)
//		
//		10진수 -> dex	
		
		System.out.println();
		System.out.printf("내가 사는 곳은 %s입니다.",str);
		
		//printf 사용빈도 낮음
		
		
		
	}
}























