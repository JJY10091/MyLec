package list05;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	//생성자를 통해서 List 생성, 저장 메소드, 삭제 메소드, 출력 메소드
	
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member mem) {
		list.add(mem);
	}
	
	public void deleteMember(String id) {
		for(int i = 0; i < list.size(); i++) {
			String tmp = list.get(i).getUserid();
			if(tmp.equals(id)) {
				list.remove(i);
				System.out.println("선택하신 회원을 삭제하였습니다.");
			}
		}
		
		
	}
	
	public void showInfo() {
		/* 
		for(출력타입 별명 : 배열) {
			System.out.println(별명);
		}
		*/
		
		/*
		for(Member mem : list) {
			System.out.println(mem);
			mem.disp();
			System.out.println("------------------");
		}
		*/
		
		//인덱스 번호가 필요한경우
		for(int i = 0; i < list.size(); i++) {
			//배열명.get(i).disp();
			list.get(i).disp();
			System.out.println("------------------");
		}
		
	}
	
}
