package tut03;

public class LoopEx {

	public static void main(String[] args) {
		
		//임의 정수값이 0인데 0과 대소를 비교할 때
		for(int i = 0; i < 0; ++i) 
			System.out.println(i);
		
		System.out.println("------------------------");
		
		int i = 0;
		while(i < 0) {
			System.out.println(i);;
			++i;
		}
		
		System.out.println("------------------------");
		
		int k = 0;
		do {
			System.out.println("조건이 틀려도 1번은 출력됩니다."+k);
			++k;
			
		}while(k < 10);
			
		
	}
}
