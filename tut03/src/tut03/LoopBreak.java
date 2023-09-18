package tut03;

public class LoopBreak {

	public static void main(String[] args) {
		//break
		//0 ~ 10까지 출력하시오.
		//단 조건이 7까지만 출력하시오.
		
		for(int i = 0; i < 10; ++i) {
		
			System.out.println(i);
	
			if(i == 7)
				break;
		}
		
		System.out.println("----------------");
		
		//1 ~ 20까지 홀수만 출력하시오
		for(int i = 1; i < 20; i++) {
			
			if (i % 2 == 0)
				continue;
			
			System.out.println(i);
		}
		
	}

}
