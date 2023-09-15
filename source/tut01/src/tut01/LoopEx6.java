package tut01;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		
		//LoopEx7.java 와 비교
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		int count = 10;
		
		while(run) {
			System.out.println("=================================");
			System.out.println("      스타벅스 커피 자동 판매기");
			System.out.println("=================================");
			
			System.out.println("1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)");
			System.out.print("메뉴선택 > ");
			
			String input = sc.next();
			
			switch(input) {
			case "P" :
			case "p" :
				
				if (count > 0 && money > 3000) {
					count--;
					money -= 3000;
					System.out.println("커피 재고량 : " + count);
					System.out.println("");
				}else {
					
					System.out.println("커피를 구매할 수 없습니다.");
					System.out.println("");
				}
				break;
				
			case "B":
			case "b":
				System.out.println("현재 남은 잔액은 "+ money +"입니다.");
				System.out.println("");
				break;
				
			case "Q":
			case "q":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			default:
				System.out.println("잘못된 선택입니다.");
				System.out.println();
				continue;		
			
			}
		}

	}
}
