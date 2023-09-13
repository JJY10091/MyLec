package tut01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Scanner(객체) : 값을 입력 받아서 처리 + System.in 같이 사용 -> Spring 할 떄 사용하지는않음
		//객체는 초기화해야함(생성자 초기화) new를 사용
		//문자열 입력 받아서 printf()로 화면에 출력
		
		//타입 객체명 = new 객체();
		//import 해야되네 java.util에 있음 자주 사용하지 않네 그래서 따로 import 함
		//ctrl + shift + o
		
		Scanner sc = new Scanner(System.in); //컴퓨터로 입력 받아서 scanner로 입력함
		
		//단순 화면 표시
		System.out.print("출력할 문자열 입력 >> ");
		String str = sc.next(); // next = > scanner로 문자열 입력 받기 위한
		//System.out.println("입력한 문자열 : "+ str);
		
		System.out.println(String.format("출력할 문자열은 %s입니다.",str));
	}
}
