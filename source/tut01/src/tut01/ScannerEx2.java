package tut01;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		//1. 문자열 -> 숫자로
		//2. 숫자 -> 문자열
		//3. Scanner -> 형변환
		
		int add = 10;
		String age = "100";
		System.out.println(add + age); 
		
		//Integer.parseInt(변수명)
		int tmp = Integer.parseInt(age);//문자열을 정수로 변환
		
		int total = add + tmp;
		
		System.out.println("변환하여 더한 나이는 " + total + "입니다.");
		
		System.out.println("--------------------------------------");
		
		int num = 1000;
		int value = 1000;
		System.out.println(num + value);
		
		String s = String.valueOf(value);//정수를 문자열로 변환
		System.out.println(num + s);
		
		System.out.println("--------------------------------------");
		
		//입력창 : Scanner 객체
		//입력내용 : 컴퓨터로 입력하는 것은 System.in
		//.next(); -> 문자열
		//Integer.parseInt();로 형변환
		//입력 메시지는 "정수를 입력하세요"라고 출력
		
		//타입 이름 = new 타입();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int input = Integer.parseInt(sc.next());
		System.out.println(100 + input);
		
		
	}

}





















