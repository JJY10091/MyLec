package tut04;
	
class Hello {

	public void welcome() {
		System.out.println("코리아아이티 아카데미");
	}
}

public class WebEx {

	public static void main(String[] args) {
		Hello h = new Hello();
		h.welcome();
		h.welcome();
	}

}
