package list02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	List<Member> list = null;

	public MemberDao() {
		list = new ArrayList<>();
	}
	
	public void addMember(Member m) {
		list.add(m);
		
	}

	public void showMember() { //상세보기
		for(Member mem : list) {
			System.out.println(mem);
			System.out.println("-----------------------");
		}
	}

	public void deleteMember(int memberID) {
		//저장 자료 -> id비교 -> 배열.remove(배열번호)
		for(int i = 0; i < list.size(); ++i) {
			if(list.get(i).getMemberID() == memberID) {
				list.remove(i);
				System.out.println(memberID + " 회원번호를 삭제하였습니다.");
			}
				
		}
		
		System.out.println("");
		
	}

	public void findById(int searchId) {
		for(int i = 0; i < list.size(); ++i) {
			int tmpID = list.get(i).getMemberID() ;
			
			if(tmpID == searchId) {
				Member m = list.get(i);
				
				System.out.println("============================");
				System.out.println("검색된 회원을 출력합니다.");
				System.out.println("회원아이디 : "+m.getMemberID()+" || 회원이름 : "+m.getMemberName());
				System.out.println("============================");

			}
				
		}
	}

}
