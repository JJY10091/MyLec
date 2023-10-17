package lamda;

interface Cals2 {
	int add(int a,int b);
}

public class LamdaEx4 {

	public static void main(String[] args) {
		//합을 구하는 람다식
		Cals2 c = (a, b) -> {
			return a + b;
		};
		System.out.println(c.add(10, 20)); 
		
	}

}
