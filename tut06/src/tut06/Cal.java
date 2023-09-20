package tut06;

public class Cal {

	public int sam(int[] scores) {
		return scores.length;
	}
	
	//합계 메소드 : 동작
	public int sum(int[] scores) {
		int sum = 0;
		for(int i=0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum;
	}
	 
	//평균 메소드 : 동작
	public double avg(int[] scores) {
		return (double)(this.sum(scores))/scores.length;
	}

}
