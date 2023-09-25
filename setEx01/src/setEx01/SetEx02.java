package setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		//String -> 출력 -> 삭제 -> 출력
								//hasNext() -> next()
		
		Set<String> set = new HashSet<>();
		set.add("U.S.A");
		set.add("Korea");
		set.add("Japan");
		
		System.out.println("--------for2--------");
		//출력
		for(String str : set) {
			System.out.println(str);
		}
		
		set.clear();
		
		//출력2 iterator 객체에 담아서 출력 - 그냥 알고만있자
		System.out.println("--------while--------");
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) { //저장된 객체를 출력
			System.out.println(ir.next());
			
		}
	}

}
