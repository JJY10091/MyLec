package tut06;


public class ArrEx03 {

	public static void main(String[] args) {
		//메소드를 이용하여 출력
		//정수에 5개 점수를 입력후
		//합계
		//평균
		
		int[] scores = null;
		scores =new int[] {80, 90, 100, 100, 100};
		
		Cal c = new Cal();
		Display d = new Display();
		d.title("컴퓨터 프로그램");
		System.out.println("배열 "+scores.length+"개의 합은 "+c.sum(scores)+"입니다.");
		System.out.printf("평균은 %.2f 입니다.\n", c.avg(scores));
		d.close("시스템 종료");
		
	}

}
