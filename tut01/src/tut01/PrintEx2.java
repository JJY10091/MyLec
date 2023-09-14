package tut01;

public class PrintEx2 {

	public static void main(String[] args) {
		//char : 문자, '', 2byte, ASCII, 숫자로 형변환 가능(타입 캐스팅)
		char c ='k';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((char)97);
		
		
		//boolean : true, false(따옴표 사용하면 x)
		//if와 사용 
		boolean b = false;
		
		//true면 통과, false면 실패
		//문자열은 값이 같다는 equals() 외에는 같다는 ==
		
		if(b == false)
			System.out.println("실패");
		
		else
			System.out.println("성공");
		
		System.out.println("---------------------------------");
		
		boolean run = true;
		
		if ( !run ) //토글 버튼에 ! 자주씀
			System.out.println("실패");
		else
			System.out.println("성공");
		
		System.out.println("---------------------------------");
		
		//삼항연산자 (조건) ? "참 일때" : "거짓일 때"
		
		char result = (!run)? 'A' : 'F';
		System.out.println(result);
		
		
	}

}
