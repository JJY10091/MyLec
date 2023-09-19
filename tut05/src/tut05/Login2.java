package tut05;

import java.time.LocalDateTime;

public class Login2 {
	private String email;
	private String passwd;
	private LocalDateTime time = LocalDateTime.now();
	
	//생성자
	public Login2() {
		System.out.println("로그인 정보를 출력합니다.");
	}
	
	//getter setter
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setPasswd (String passwd) {
		this.passwd = passwd;
	}
	
	public String getEmail() {
		return email;
	}
	public String getPasswd() {
		return passwd;
	}
	
	
	//toSting
	@Override
	public String toString() {
		return "로그인정보 \n[이메일 : " + email + ", "
				+ "비밀번호 : " + passwd + ", "
					+ "로그인 시간 : " + time + "]";
	}

	
}
