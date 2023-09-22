package tut07;

public class Register {
	//1.필드
	//2.생성자 : 기본 생성자 : 파일이름과 동일하면
	//3.getter, setter
	//4.메소드
	
	private String email;
	private String passwd;
	private String uname;
	
	public Register() {}

	public Register(String email, String passwd, String uname) {
		this.email = email;
		this.passwd = passwd;
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String disp() {
		//필드를 가지고와도되고 메소드로 가져와도됨(3개 모두 같은)
		return "이메일 : "+getEmail()+", 비밀번호 : "+passwd+", 이름 : "+this.uname;		
	}
	
	
	
	
}















