package tut03;

public class LoopEx3 {

	public static void main(String[] args) {
		//1 ~ 100까지 합을 구하시오
		//while
		//출력 예시 : 1 ~ 100까지 합은 ** 입니다.
		
		int sum = 0; //합계가 저장될 변수
		
		int i = 1; 
		while (i <= 100) {
			sum += i;
			i++;
		}
		

		System.out.println("1 ~ 100까지 합은 "+sum+"입니다.");
	}

}
