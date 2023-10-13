package exception;

class LoginException extends Exception {

	public LoginException() {}

	public LoginException(String s) {
		super(s);
	}
	
}

class LoginCheck extends LoginException{
	String dbUserid = "koreait";
	String dbPasswd = "12345";
	
	void loginCheck(String uid, String pwd) throws LoginException {
		if ( uid.isEmpty() || pwd.isEmpty() ) {
			throw new LoginException("아이디 또는 비밀번호를 입력해 주세요");
		}else if( !uid.equals(dbUserid) || !pwd.equals(dbPasswd)){
			throw new LoginException("아이디 또는 비밀번호를 확인하세요");
		}else {
			System.out.println(uid + "님 로그인 되었습니다.");
		}
			
	}
}

public class LoginEx {
	//1. 빈값 : 아이디 또는 비밀번호 입력
	//2. 아이디 비밀번호가 일치하지 않으면..
	//3. 일치...
	
	public static void main(String[] args) {
		
		try {
			LoginCheck login = new LoginCheck();
			login.loginCheck("koreait", "12345");
			
		}catch(LoginException e) {
			e.printStackTrace();
		}
	}
	
	
}
