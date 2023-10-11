package test;

public class HelloJava {

	public static void main(String[] args) {
		//Hello Java 출력
		System.out.println("Hello Java");

		// 정수(decimal) -> printf()
		int num = 100;
		
		//정수 값은 100입니다.
		System.out.println("정수 값은 " + num + " 입니다.");
		System.out.printf("정수 값은 %d 입니다.", num);
		System.out.println(String.format("정수 값은 %d입니다.",num));
		
		//Koreait 아카데미입니다.
		String str = "Koreait";
		System.out.println( String.format("%s 아카데미입니다.",str));
	}

}
