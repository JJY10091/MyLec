package exam03;

public class Member {
	private int memId;
	private String memName;
	private String memPwd;
	private String memRegDate;
	private String memGender;
	private String memIntro;
	
	public int getMemId() {
		return memId;
	}
	
	public void setMemId(int memId) {
		this.memId = memId;
	}
	
	public String getMemName() {
		return memName;
	}
	
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	public String getMemPwd() {
		return memPwd;
	}
	
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	
	public String getMemRegDate() {
		return memRegDate;
	}
	
	public void setMemRegDate(String memRegDate) {
		this.memRegDate = memRegDate;
	}
	
	public String getMemGender() {
		return memGender;
	}
	
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	
	public String getMemIntro() {
		return memIntro;
	}
	
	public void setMemIntro(String memIntro) {
		this.memIntro = memIntro;
	}
	@Override
	public String toString() {
		return "회원ID:"+memId+" "
				+ " 회원이름:"+memName+" "
				+ " 비밀번호:"+memPwd+" "
				+ " 가입일:"+memRegDate+", "
				+ " 성별:"+memGender+", "
				+ " 자기소개:" + memIntro + "\n";
	}
	
	
}
