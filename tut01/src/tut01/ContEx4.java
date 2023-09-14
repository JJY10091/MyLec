package tut01;

import java.util.Scanner;

public class ContEx4 {

	public static void main(String[] args) {
		//임의의 정수를 입력 받아서 홀수, 짝수를 표시하시오
		//입력은 문자로 입력 받아서 정수로 변환하여 사용하시오
		//switch
		//입력 화면은 1이면 홀수,짝수 결과, 2면 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("계산(1), 종료(1외)  ");
		System.out.println("===========================");
		System.out.print(">>");
		int choice = Integer.parseInt(scanner.next());
		
		switch(choice) {
		
		case 1:
			System.out.println("===========================");
			System.out.println("홀수, 짝수 계산을 진행합니다.....");
			System.out.println("===========================");
					
			System.out.print("정수 입력 > ");
			int num = Integer.parseInt(scanner.next());
			
			String result = (num % 2 == 0)? "짝수" : "홀수";
		
			System.out.println("입력하신 정수는 "+result+"입니다.");
			
			break;
			
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		
		}
		
	}

}
