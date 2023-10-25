package exam01;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "";

		while (!choice.equals("Q") && !choice.equals("q")) {
			System.out.println("A(a).입력 |  Q(q).종료");
			System.out.print("선택 > ");

			choice = sc.next();
			System.out.println("");

			if (choice.equals("A") || choice.equals("a")) {
				System.out.print("영어입력(띄어쓰기 없이) > ");
				String str = sc.next();

				System.out.println("대문자 : " + str.toUpperCase());
				System.out.println("");

			} else if (!choice.equals("Q") && !choice.equals("q")) {
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
