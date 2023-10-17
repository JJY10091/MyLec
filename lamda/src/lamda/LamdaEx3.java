package lamda;

interface Hello {
	String greeting(String str);
}

public class LamdaEx3 {
	
	public static void main(String[] args) {
		//리턴타입이있는 람다식
		Hello h1 = (s1)->{
			return s1;
		};
		System.out.println(h1.greeting("Hello, Koreait"));
		
	}

}
