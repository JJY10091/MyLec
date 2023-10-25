package exam02;

public class Exam02 {
	double avgCal(int a[]) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		
		return (double)sum/a.length;
	}
	
	public static void main(String[] args) {
		int [] numArr = {8, 3, 1, 6, 2, 4, 5, 9};
		Exam02 cal = new Exam02();
		
		double avg = cal.avgCal(numArr); 
		System.out.printf("배열 값의 평균은 %.2f 입니다.",avg);
	}
}
