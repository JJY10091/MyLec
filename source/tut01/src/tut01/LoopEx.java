package tut01;

public class LoopEx {

	public static void main(String[] args) {
		//정수 0 ~ 4까지 출력하는 반복문
		
//		for(int i=0; i<5 ; ++i) {
//			System.out.println(i);
//		}
		
		//0부터 100미만 출력 하는 for
//		for (int i = 0; i < 100; ++i) {
//			System.out.print(i);
//		}
		
		//1부터 10이하까지 출력하는 for
//		for (int i = 1; i <= 10; ++i) {
//			System.out.println(i);
//		}
		
		// 0 ~ 10미만 출력하는 for
		for(int i = 0; i < 10; ++i) {
			
			System.out.print(i+ " ");
		}
			
		// 0 ~ 10미만 출력하는 for
//		초기값
//		while(조건) {
//			출력코드
//			증감값
//		}
		
		System.out.println("\n----------------------");
		int i = 0;
		while(i<10) {
			System.out.print(i + " ");
			++i;
		}
		System.out.println("");
		
		//10이하 부터 1까지 출력하는 for
		for (int j = 10; j > 0; --j) {
			System.out.print(j +" ");
		}
		System.out.println("");
		
	}

}













