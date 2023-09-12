package tut01;

public class CompEx {

	public static void main(String[] args) {
		//결과는 true, false
		//1. 크기비교 : >=, <=, >, <
		int num1 = 3;
		int num2 = 5;
		boolean res1 = (num1 >= num2);
		System.out.println(res1);
		
		//2. 등가비교 : ==, !=
		boolean res2 = (num1 == num2);
		System.out.println(res2);
		
		boolean res3 = (num1 != num2);
		System.out.println(res3);
		
		
		//3. 참조비교 : 메모리 주소를 비교
		//new 키워드(자바에서 사용하는 문법)를 사용하면 다른 메모리에 저장
		//문자열 : 참조타입으로 생성 cf)기본형 => String s1 ="" 
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//문자열 비교 .equals() 
		boolean res4 = s1.equals(s2);
		System.out.println(res4);
		
		//메모리 주소 비교 ==
		boolean res5 = (s1 == s2);
		System.out.println(res5);
		
		
		
		
	}
}
