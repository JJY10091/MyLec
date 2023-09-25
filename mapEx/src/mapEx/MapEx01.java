package mapEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		//Map - HashMap  >> key값은 중복되면 안됨
		//101 -> 서울
		//102 -> 부산
		//103 -> 대구
		
		//Map<key, value> map = new HashMap<K,V>();
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
		//System.out.println(map.toString());
		
//		배열명.forEach((k, v) -> {
//			출력코드
//		});
		
		//javascript에서는 -> 대신 => 를 사용
		map.forEach((k, v) -> {
			System.out.println("키는 "+k+", 값은 "+ v);
		});
		
		System.out.println("---------------------");
		
		/*map
		userid01 -> 홍길동
		userid02 -> 김철수
		userid03 -> 이영희*/
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("userid01", "홍길동");
		map2.put("userid02", "김철수");
		map2.put("userid03", "이영희");
		
		map2.put("userid03", "코리아");
		
		map2.forEach((k,v)-> {
			System.out.println("키는 "+k+", 값은 "+v);
		});
		
		//
		System.out.println(map2.containsValue("김철수"));
		
		System.out.println(map2.containsKey("userid02"));
		
	}

}























