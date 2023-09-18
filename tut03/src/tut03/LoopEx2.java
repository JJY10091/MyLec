package tut03;

public class LoopEx2 {
	
	public static void main(String[] args) {
		//값을 누적을 할 때 전역처리(변수를 중괄호 위로 이동), static
		//1 ~ 100 
		
		int sum = 0;
		for(int i = 1; i < 100; ++i) {
			sum += i;
		}			
		System.out.println(sum);
		
	}
}
