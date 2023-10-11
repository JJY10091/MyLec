package staticPrj;

class Login {
	static int point = 1000;
	String userid;
	String passwd;

	public Login(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;

		if (userid.equals("koreait") && passwd.equals("1234")) {
			System.out.println("로그인 되었습니다.");
			point += 100;
		} else {
			System.out.println("로그인을 확인해 주세요.");
			point += 0;
		}
	}

	@Override
	public String toString() {
		return "Login [point=" + point + ", userid=" + userid + ", passwd=" + passwd + "]";
	}

}

class Shop {

	static int number = 100;
	static String userid;
	String passwd;
	int test = 1;

	// 아이디, 비번을 생성자에 입력하면 number가 자동으로 1씩 증가
	public Shop(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
		number++;
	}

	@Override
	public String toString() {
		return "Shop [nummer = " + number + " userid=" + userid + ", passwd=" + passwd + ", test=" + test + "]";
	}

}

public class StaticEx2 {

	public static void main(String[] args) {
//		Shop m = new Shop("koreait", "1234");
//		System.out.println(m.toString());
//		
//		System.out.println("---------------------");
//
//		Shop m2 = new Shop("seoulit","4567");
//		System.out.println(m2.toString());
//		System.out.println(m.toString());
		
		Login login = new Login("koreait","1234");
		System.out.println(login.toString());	//point 1100
		
		System.out.println("-----------------");
		Login login2 = new Login("kore2t","1234"); 
		System.out.println(login2.toString());	//point 1100
		
		System.out.println("-----------------");
		Login login3 = new Login("koreait","1234");
		System.out.println(login3.toString());	//point 1200

	}

}
