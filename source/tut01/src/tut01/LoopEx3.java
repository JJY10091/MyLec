package tut01;

public class LoopEx3 {

	public static void main(String[] args) {
		//도끼로 나무를 100번까지 찍는 for문
		//도끼를 20번째 찍으면 "나무가 쓰러집니다"라는 메시지 출력 후 프로그램 종료
		
//		for(int hit = 1; hit < 100; ++hit) {
//			
//			if (hit > 20) {
//				System.out.println("나무가 쓰러집니다.");
//				break;
//			}
//			System.out.print (hit + " ");
//		}
//		System.out.println("프로그램 종료");
		
		//=>while문으로
		
		
		int hit = 1;
		while(hit < 100) {
			if (hit > 20) {
				System.out.println("나무가 쓰러집니다.");
				break;
			}
			System.out.print(hit + " ");
			
			++hit;
		}
		
		
		
	}
}




















