package ioEx;

import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		// Spring 파일 이름 -> 현재 날짜의 1/1000초로 변경
		// 오늘날짜 폴더
		// 현재 시간을 1/1000

		// currentTimeMillis() :
		// 월(MM) - 분(mm)
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));

		System.out.println(System.currentTimeMillis());	//추가적으로 uuid도 포함시켜서

		// substring(".") : .을 기준으로 문자열 자름
//		원본저장 : koreait.txt
//		사본저장 : System.currentTimeMillis().txt
//		용량저장 : 1~10M

		
	}

}
