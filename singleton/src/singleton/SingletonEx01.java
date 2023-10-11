package singleton;

class SingletonTest {
	private static SingletonTest st = new SingletonTest();
	private SingletonTest() {}

	public static SingletonTest getSingleton() {//instance = 연결
		return st;
	}	
	
	//공유해서 사용할 메소드-----------------------------
}



public class SingletonEx01 {

	public static void main(String[] args) {
		SingletonTest st1 = SingletonTest.getSingleton();
		SingletonTest st2 = SingletonTest.getSingleton();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1 == st2);
	}

}
