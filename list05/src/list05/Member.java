package list05;

public class Member {
	private String userid;
	private String passwd;
	
	public Member() {}
	
	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public void disp() {
		System.out.println("아이디 : "+userid+", 비밀번호 : "+ passwd);
	}
	
	public String getUserid() {
		
		return userid;
	}
	
}
