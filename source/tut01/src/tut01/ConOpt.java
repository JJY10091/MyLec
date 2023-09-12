package tut01;

public class ConOpt {

	public static void main(String[] args) {
		//삼항연산자
		//타입 변수 = (조건) ? "참일 때" : "거짓일 때"
		
		//정수 두 개를 비교하여 크면 1, 작으면 0을 출력하시오.
				
		int num1 = 3;
		int num2 = 4;
		
		int res = (num1 > num2) ? 1 : 0;
		System.out.println(res);
		
		//임의의 정수를 생성 후 1이면 홀수, 0이면 짝수를 출력하시오.
		//1
		int num3 = 5;
		
		String res1 = (num3 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(res1);
		
		//2 
		if(num3 % 2 == 0) 
			System.out.println("Even Number!!!");
		else
			System.out.println("Odd Number!!!");

		//3
		String msg = "";
		if(num3 % 2 == 1) {
			msg = "홀수";
		}else {
			msg = "짝수";
		}
		System.out.println(msg);
		
				
	}
}
