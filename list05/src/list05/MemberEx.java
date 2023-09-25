package list05;

public class MemberEx {

	public static void main(String[] args) {
		//줄(List)만들고 (dao) -> 칸 채우기(member)
		MemberDao md = new MemberDao();
		
		md.addMember(new Member("홍길동", "1111"));
		md.addMember(new Member("김철수", "2222"));
	
		md.showInfo();
		
		md.deleteMember("홍길동");
		
		md.showInfo();
	}

}
