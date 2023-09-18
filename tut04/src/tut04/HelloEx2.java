package tut04;

public class HelloEx2 {
	
	//메소드는 main메소드 위에 만듬
//	접근제한자 리턴타입 메소드명() {
//	
//	}
	
	public void title(String str) {
		//부산 Koreait 아카데미
		//서울 Koreait 아카데미
		//광주 Koreait 아카데미
		
		System.out.println(str+" Koreait 아카데미");
	}
	public void info(String tel ,String addr) {
		System.out.println("전화번호 : "+ tel);
		System.out.println("주소 : "+ addr);
	}
	
	public static void main(String[] args) {
		//코리아아이티 아카데미 : sysout => 중복되는 내용 => 메소드 생성해서 작업
		//전화번호, 주소
		//코리아아이티 아카데미 : sysout
		
		HelloEx2 busan = new HelloEx2();
		busan.title("부산");		
		busan.info("051-333-3333", "부산광역시");
		busan.title("부산");
		
		System.out.println("---------------------------");
		
		HelloEx2 seoul = new HelloEx2();
		seoul.title("서울");
		seoul.info("02-222-2222", "서울특별시");
		seoul.title("서울");
		
		System.out.println("---------------------------");
		
		HelloEx2 gwangju = new HelloEx2();
		gwangju.title("광주");
		gwangju.info("063-444-4444","광주광역시");
		gwangju.title("광주");
		
	}
}
