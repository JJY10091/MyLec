package tut05;

public class Login2Ex {

	public static void main(String[] args) {
		
		Login2 user1 = new Login2 ();
		
		user1.setEmail("koreait@korea.net");
		user1.setPasswd("12345");
		
		System.out.println("이메일 : " + user1.getEmail());
		System.out.println("비번 : " + user1.getPasswd());
		System.out.println("---------------");
		System.out.println("toString 출력");
		System.out.println(user1.toString()); 
		
	}

}
