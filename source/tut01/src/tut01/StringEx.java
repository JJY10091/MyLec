package tut01;

public class StringEx {

	public static void main(String[] args) {
		//기본타입 koreait 문자열 저장
		//객체타입 koreait 문자열 저장
		//비교하는 예제
		String str ="koreait"; //stack
		String str2 = new String("koreait");  //heap
			
		
		//문자열비교 A.equals(B) -> 값 비교(문자열 비교에서만!)
		if(str.equals(str2))
			System.out.println("저장 위치는 다르지만 값은 동일합니다.");
			
		//문자열비교 == -> 메모리 주소값(문자열 비교에서만!) 숫자 값을 비교할 때는 사용함!
		//비교연산자(> , < 결과 true, false)
		
		System.out.println(str == str2);
		boolean result = (str == str2);

		if(result)
			System.out.println("메모리가 동일합니다.");
		else
			System.out.println("메모리 위치가 다릅니다.");
	
/*		
		Integer num1 = 1;
		Integer num2 = 2;
		Integer num3 = new Integer(1);
		Integer num4 = 1;
	
		//메모리 위치확인 : System.identityHashCode();
		boolean res = (num1 == num2);
		
		System.out.println("num1 : "+ System.identityHashCode(num1));
		System.out.println("num4 : "+ System.identityHashCode(num4));
		System.out.println("num3 : "+ System.identityHashCode(num3));
		
		System.out.println("str : "+ System.identityHashCode(str));
		System.out.println("str2 : "+ System.identityHashCode(str2));
		
		System.out.println(""+ num1 + num2 + num3 +num4);
		
		//기본형은 값이 같으면 메모리도 같음
		//참조형은 값이 같아도 메모리가 다르네
*/
		
		
	
		
		
		//** 문자열을 제외하면 비교는 == 사용하면 됨
		
	}
}
