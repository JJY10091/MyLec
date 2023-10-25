package exam02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학년을 입력 하세요 : ");
		int grade = sc.nextInt();

		System.out.print("점수를 입력 하세요 : ");
		int jumsu = sc.nextInt();

		switch(grade) {
		case 1 :
		case 2 :
		case 3 :
			
			if(jumsu >= 60)
				System.out.println("합격입니다.");
			else
				System.out.println("불합격입니다.");
			break;
		case 4 :
			if(jumsu >= 80)
				System.out.println("졸업입니다.");
			else
				System.out.println("재시험입니다.");
			break;
		default:
			System.out.println("학년을 확인하세요.");
			break;
		}
		sc.close();
	}

}
