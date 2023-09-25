package setEx01;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


class Member{
	private String userid;
	private String passwd;
	
	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public void disp() {
		System.out.println("아이디 : "+userid+" , 비밀번호 : " +passwd);
	}
}

public class SetEx03 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		//add 객체 저장 => new Memver("","");
		set.add(new Member("홍길동","1234"));
		set.add(new Member("김철수","2222"));
		set.add(new Member("이영희","3333"));
		
		for(Member mb : set) {
			mb.disp();
		}
		
		System.out.println("----------");
		
		Iterator<Member> ir = set.iterator();
		
		while(ir.hasNext()) {
			ir.next().disp();
		}
	}

}
