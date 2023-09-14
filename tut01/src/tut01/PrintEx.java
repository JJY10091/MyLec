package tut01;

public class PrintEx {

	public static void main(String[] args) {
		//정수 5와 8의 합을 출력하시오.
		//(1)변수 선언, 초기화 = (2)선언과 초기화를 동시
		
//		int num1, num2; //선언
//		num1 = 5; //초기화
//		num2 = 8;
		
		//변수이름 첫글자는 소문자
		int num1 = 5;
		int num2 = 8;
		
		//System.out.println(num1 + num2);
		
		//결과값을 변수에 저장 후 출력
		
		int result = num1 + num2;
		
		System.out.println(result);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//byte(1) -> int(4) -> float(4) - > double(8)
		//0, 1 => 1byte = 8bit => 2진수 8번 => 2의8제곱 => 256 -> 음수, 양수 => 256 / 2 =128
		//byte = 음수(-128) 0 양수(127)
		//byte b= 127;
		
		System.out.println("-----------------------------");
		//int 10억 넘어가면~
		//long은 선언할때 뒤에 L붙임
		
		long money = 10000000000L;
		
		//float 8, double 15자릿수
		//PI는 값이 정해져 있는(고정되어 있는) 값 - 상수 => 변수명을 대문자로 적는다
		float PI = 3.12345678F;
		System.out.println(PI);
		
		
		
	}

}




























