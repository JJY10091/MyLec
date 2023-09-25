package mapEx;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	Map<String, Member> map = null;

	
	public MemberDao() {
		map = new HashMap<>();
	}
	
	public void putMember(String id,Member m) {
		map.put(id, m);
	}
	
	public boolean deleteMember(String uid) {
		//Map loop 사용x 순서없이 담겨져있는것.
		//true, false
		
		if(map.containsKey(uid)) {
			map.remove(uid);
			
			return true;
		}
		
		return false;
	}

	public void showInfo() {
		/*
		배열명.forEach(	(key, value) ->{
			출력코드 = 배열명.get(키값)
		}	)*/
		
		map.forEach((k,v)->{	//k : "u1","u2","u3"  v : Member객체
			Member mem = map.get(k);
			mem.disp();
		});
		
	}
}
