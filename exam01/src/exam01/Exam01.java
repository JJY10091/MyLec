package exam01;

public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i < 1000; i++) {
			if( (i % 3) != 0 && (i % 5) != 0 ) {
				sum += i;
			}
		}
		System.out.println("3, 5의 배수가 아닌 수의 총합 : " + sum);
	}
}
