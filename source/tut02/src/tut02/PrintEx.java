package tut02;

public class PrintEx {

	public static void main(String[] args) {
		//정수 10을 출력 : 10진수,      8진수,  16진수로 출력
					//   d(decimal)  o      x(hex)
		
		int num = 10;
//		System.out.printf("%d %o %x",num,num,num);
		
		System.out.printf("출력값은 %d입니다.\n" , num);
//		System.out.println( String.format("출력값은 %d %o입니다.", num,num));
		
		//8진수 출력값은 %o입니다.
		System.out.printf("8진수 출력값은 %o(8)입니다.\n",num);
		System.out.println(String.format("8진수 출력값은 %o(8)입니다.", num));

		//16진수 출력값은 %x입니다.
		System.out.printf("16진수 출력값은 %x(16)입니다.\n",num);
		System.out.println(String.format("8진수 출력값은 %x(16)입니다.", num));
		
		double d = 1.2345;//실수 -> f
		//실수 값은 %f입니다.
		System.out.printf("실수 값은 %f입니다.\n",d);
		System.out.printf("실수 값은 %.2f입니다.\n",d);
		
		String str = "Koreait";

		System.out.println(String.format("부산 %s 아카테미입니다.", str));
		System.out.printf("문자는 %s입니다.\n",str);
		
		//타입이 다른 연산 -> 형변환(캐스팅)
		//메모리 공간이 적은 값을 큰 값에 넣으면 자동 형변환 - 묵시적형변환 업캐스팅
		//메모리 공간이 큰 값을 작은 값에 넣으면 강제 형변환 - 명시적형변환 다운캐스팅

		// 정수 + 실수 = 실수
		// 정수 + 실수 = 정수
		int num2 = 5;
		double num3 = 3.5;
		
		double result = num2 + num3;
		System.out.println(result);
		
		int result2 = num2 + (int)num3;
		System.out.println(result2);
		
	}

}

