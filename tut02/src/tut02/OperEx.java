package tut02;

public class OperEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;

		String s1 = "koreait";
		String s2 = "Koreait";

		// 비교
		System.out.println(num1 > num2); // true, false
		System.out.println(num1 == num2);

		// String 비교 -> A.equals(B)
		System.out.println(s1.equals(s2)); // 문자열 동등 비교
		System.out.println(!s1.equals(s2));

		// A = B : B를 A에 저장
		boolean b = (num1 == num2);

		// 조건문 : if
		// 프로그래밍은 중복, 불필요한 내용은 줄일려고
		// 객체, 배열은 1000개정도 된다고 생각하고

		if (!b)
			System.out.println("두 수는 다릅니다.");
		else
			System.out.println("두 수는 일치합니다.");

		String result = (!b)? "다름":"같음" ;
		System.out.println(result);
		System.out.println("-----------------");
		
		//정수 입력 받아서 홀수, 짝수 구분하시오

		int num3 = 2;
		
		//System.out.println(num3 % 2);
		
		if (num3 % 2 == 0) 
			System.out.println("짝");
		else
			System.out.println("홀");
		
		String res = (num3 % 2 != 0)? "홀":"짝";
		System.out.println(res);
		
		
		
		// 타입에 저장

	}
}
