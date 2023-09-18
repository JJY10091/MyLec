package tut03;

import java.util.Scanner;

public class BalanceEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0; //잔액
		int money = 0; //예금
	
		boolean isRun = true;
		
		while (isRun) {
			System.out.println("----------------------------");
			System.out.println("1.예금|2.출금|3.확인|4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("예금할 금액을 입력 : ");
				money = sc.nextInt();
				balance += money;
				
				System.out.println("입금 되었습니다.");
				System.out.println("잔고를 확인하세요.");
				System.out.println("");
				System.out.println("");
				break;
				
			case 2:

				System.out.print("출금을 진행합니다.");
				System.out.println("현재 잔액 : " + balance);
				System.out.print("출금할 금액을 입력 : ");
				money = sc.nextInt();
			
				
				if(money > balance) {
					System.out.println("잔액이 부족");
					System.out.println("");
					System.out.println("");
					break;
				}else {
					balance -= money;
					System.out.println("출금이 완료되었습니다.");
					System.out.println("");
					System.out.println("");
					break;
				}
				
			case 3:
				System.out.println("현재 잔고를 확인합니다.");
				System.out.println("현재 잔액은 "+ balance);
				System.out.println("");
				System.out.println("");
				break;
				
			case 4: 
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				System.exit(0);
				break;
				
			default :
				System.out.println("잘못된 입력입니다.");
				System.out.println("");
				System.out.println("");
				break;
			}
			
		
		}
		sc.close();
	}
}
