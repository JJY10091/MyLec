package lamda;

interface Cals {
	//람다식은 일반적으로 인터페이스 안에 메소드 1개만 생성 후 사용
	void dispNum(int num);
}


public class LamdaEx2 {

	public static void main(String[] args) {
		Cals c; //전역변수로 사용할수 있지만 프로그램이 복잡해지면 메모리상 문제가 발생할지도..
		
		c = (num) -> {
			System.out.println(num);
		};
		c.dispNum(10000);
		
		System.out.println("------------------------");
		
		c = (x) -> {
			System.out.println(x * 10);
		};
		c.dispNum(10);
		
		System.out.println("------------------------");
		
		c = (t) -> {
			int sum = t + 10;
			System.out.println(sum);
		};
		c.dispNum(20);
		
		
	}

}
