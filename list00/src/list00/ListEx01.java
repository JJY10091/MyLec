package list00;

import java.util.*;

public class ListEx01 {

	public static void main(String[] args) {
		//List -> ArrayList, Vector
		//입력, 수정, 삭제 -> 데이터 변동이 잦은
		//정수를 출력하는 ArrayList
		
		List<Integer> aList = new ArrayList<>(); //자식객체에 <> 생략가능 : 부모객체에서 사용했으므로
		
		//add();
		aList.add(100); //배열 추가 값입력
		aList.add(200);
		
		int count = aList.size();
		System.out.println(count);
		
		System.out.println("for 1");
		for(int i =0; i < count; ++i) {
			System.out.println(aList.get(i)); 
			//size()로 배열수 확인하고 get(인덱스)로 출력
			//객체 타입 get aList.get(i).필드
		}
		System.out.println("-----------");
		
		System.out.println("for 2");
		for(Integer num : aList) { //향상된 for
			System.out.println(num);
		}
	}

}
