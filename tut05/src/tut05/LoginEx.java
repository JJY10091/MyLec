package tut05;

public class LoginEx {
	
	public static void main(String[] args) { 
		Login w = new Login();
		w.userid = "1234";
		w.passwd = "134";
		w.age = 10;
		System.out.println("아이디는	"+w.userid+"입니다.");
		System.out.println("비밀번호는	"+w.passwd+"입니다.");
		System.out.println("나이는	"+w.age+"입니다.");
		
		System.out.println("-------------------------");
		Login g = new Login();
		g.userid = "1212334";
		g.passwd = "fdsf";
		g.age = 20;
		System.out.println("아이디 : "+g.userid+",\t "
				+ "비밀번호 : "+g.passwd+",\t "
						+ "나이 : "+g.age );
	}

}
