package tut02;

public class SccpeEx {
	//필드 영역
	public static void main(String[] args) {
		//변수가 미치는 범위
		
//		int num = 10;
//		{
//			int num2 = 5;
//			System.out.println(num);
//		}
//		System.out.println(num);
//		
//		int num = 10;
//		for (int i = 0; i < 10 ; ++i) {
//			System.out.println(num);
//			System.out.println(i);
//		}
//		System.out.println(num);
		
//		int num = 10;
//		int i;
//		for(i = 0; i < 10; ++i) {
//			System.out.println(num);
//			System.out.println(i);
//		}
//		System.out.println(i);
		 
		//1 ~ 10까지 더해서 총합을 출력(한 번)
		//누적되는 값을 처리하려면 반복문 밖에서 변수 선언하거나 (전역)
		//static 메소드 사용해야 
		
//		int sum = 0;
//		for(int i = 1; i <= 10; ++i) {
//			
//			// int sum = 0;  //지역변수로 사용하면 반복문 밖에서 사용 x
//			sum += i;
//		}
//		System.out.println(sum);
		
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);
//			++i;
//		}
//		System.out.println(i);
		
		//변수 값은 바로 위 중괄호 연역에서만 값을 사용
		//단, for()문은 오른쪽 {} 안에서만 값을 사용할 수 있다.
		
		//값을 누적할 때는 전역변수 형태로 또는 변수 앞에 static 붙혀서
						//(바로 위 중괄호 밖으로 이동)
		
		
		
		
	}

}


