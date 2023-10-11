package staticPrj;

class Member {
	int price = 10000;
	static double tax = 0.1;
	
	void method() {
		System.out.println("인스턴스(new) 메소드");
	}
	
	static void staticMethod() {
		System.out.println("Static 메소드");
	}
	
	
}

public class StaticEx {

	public static void main(String[] args) {
		//static -> new(인스턴스화)할 수 있지만 -> 클래스명.메소드명(); 으로 사용
		
		Member m = new Member();
		m.method();
		Member.staticMethod();
		System.out.println(m.price); //인스턴스
		System.out.println(m.tax);
		System.out.println(Member.tax); //인스턴스 x, m.tax사용 권장 x
		
		Member m2 = new Member();
		m2.method();
		Member.staticMethod();
		
		
		
	}

}
