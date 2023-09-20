package tut06;

public class ArrEx01 {

	public static void main(String[] args) {
		//배열 + 반복문(for - 배열번호가 필요할 때, 향상된 for- 값만 출력할 때) 같이 사용
		//1.for(int i = 0; i< 배열명.length; ++i) {출력코드(배열명[i])}
		//2.for(출력타입 별명 : 배열명) {출력코드(별명)}
		//배열번호(index)는 0번 부터 시작
		//i, idx, index 변수이름이 보이면 배열 처리
		
		//정수 100개에 값을 저장하는 프로그램을 완성하시오.
		
		int[] value = new int[3];	//4byte * 100개의 빈 공간이 생성 - 초기화 아님
		//for(int i = 0; i < value.length; ++i) {		}
		
		value[0] = 100; //초기화
		value[1] = 200; //초기화
		value[2] = 300;
		
		//배열 0 ~ 2번까지 출력하시오
		//배열명[인덱스]
		//for
		
		//value[0]의 값은 0입니다.
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
		
		for(int i = 0; i < value.length  ; ++i) {
			//System.out.println("value["+i+"]의 값은" + value[i]+"입니다.");
			System.out.println((i+1) + "번의 값은 "+value[i]+"입니다.");
		}
		
		System.out.println("--------------------------------");
		 
		//int[] num = {1, 2, 3, 4, 5};
		//초기값을 성정하면 배열 개수가 생성
		//학생 3명 점수를 초기값으로 설정 후
		//화면에 출력하시오
		//합계를 출력하시오
		//평균을 출력하시오
		
		int[] jumsu = {88, 77, 67, 55, 47};
		int sum = 0;
		double avg = 0;
		
		System.out.println("등록된 학생 수는 "+jumsu.length+"명 입니다.");
		
		System.out.println("======화면출력======");
		for(int i = 0; i < jumsu.length ; ++i) {
			System.out.print(jumsu[i]+ " ");
		}
		
		System.out.println("======합계출력======");
		//합계 : 누적(전역, static)
		for(int i = 0; i < jumsu.length ; ++i) {
//			System.out.println((i+1) + "번 점수는 "+jumsu[i]+"입니다.");
			sum += jumsu[i];
		}
		avg = (double)sum / jumsu.length;
		System.out.println("합계는 "+ sum + "입니다.");
		System.out.println("평균은 "+ avg + "입니다.");
		
		//출력 포맷 변경 소수점 2자리로 설정
		System.out.println(String.format("평균은 %.2f 입니다.", avg));
		System.out.printf("평균은 %.2f 입니다.", avg);
		
		
	}	
}















