package tut01;

public class CastEx {
	
	public static void main(String[] args) {
		//묵시적 형변환 = 업 캐스팅(자동형변환) : 작은 => 큰
		int i = 100; //4byte 정수
		float f = i; //4byte 실수 
		//실수가 정수보다 큰 
		
		System.out.println(i);
		
		
		//명시적 형변환 = 다운 캐스팅 (강제형변환) : 큰 => 작은
		float f2 = 1.23F;
		int num = (int)f2;
		System.out.println(num);	
		
		System.out.println("------------------------------");
		
//		double d1 = 1.23;
//		double d2 = 3.45;
//		System.out.println(d1/d2);
		
		int cnt = 3;
		int sum = 100;
		double avg = 0.0;
		
		avg = (double) sum /cnt ;
		System.out.println(avg);
		
	}
}
