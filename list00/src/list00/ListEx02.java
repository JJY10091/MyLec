package list00;

import java.util.*;

public class ListEx02 {

	public static void main(String[] args) {
		//정수 타입 입력 후 -> 삭제 -> 출력(for1)

		ArrayList<Integer> list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		//list<100,200,300> 삭제 - remove();
		list.remove(1);	//200삭제 
		list.remove(1);	//300삭제
		
		int count = list.size();
		for(int i = 0; i < count; ++i) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		
		//문자열 입력, 삭제, 출력
		List<String> aList = new ArrayList<>();
		
		aList.add("#f00");	//red : 색상코드
		aList.add("#0f0");	//green
		aList.add("0 0 255");	//blue #00f -> f(255) = 0 0 255
		
		aList.remove(2);
		aList.remove("#f00"); //문자열로 검색해서 삭제할수도 있음
		
		count = aList.size();
		for(int i = 0; i < count; ++i) {
			System.out.println(aList.get(i));
		}
	}

}
