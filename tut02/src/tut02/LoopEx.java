package tut02;

public class LoopEx {

	public static void main(String[] args) {
		//for(초기값; 조건; 증감값){
		//	출력코드
		//}

		//0부터 10출력하는 반복문 완성하시오. for
		for(int i = 0; i < 10; ++i) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		//1부터 20까지 출력하는 for
		for(int i = 1; i <= 20; ++i) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		//for > while
		int j = 1;
		while(j < 20) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println("");
		
		//0 ~ 10까지 출력하는 for
		//짝수만 출력하세요
		//건너뛸 때는 continue;
		
		for(int i = 0; i <= 10; i++) {
			
			if(i % 2 == 1)
				continue;
			
			System.out.print(i+" ");
		}
		System.out.println("");

		
//		int t = 0;
//		while(t <= 10) {
//			
//			if(t % 2 ==1 ) {
//				++t;
//				continue;
//			}
//			System.out.print(t+" ");
//			t++;
//		}

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
		}
	}
}

















