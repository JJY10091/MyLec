package ioEx;

import java.io.UnsupportedEncodingException;

public class CharSetEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 한글 Charset : EUC-KR -> 949(MS) -> UTF-8(유니코드 3byte)
		// ANSI(영어) = ASCII(1byte) 한글표현 잘안됨 한글은 3byte정도 -> EUC-KR -> 949 -> UTF-8(유니코드
		// 3byte)

		// 한글 전송 -> byte[] -> loop
		// 문자열.getByte(문자셋);

		// EUC-KR
		String str = "코리아아이티";
		byte[] b1 = str.getBytes("EUC-KR");

		System.out.println(b1.length);

		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + " ");
		}
		System.out.println("");
		System.out.println(new String(b1, "UTF-8"));	//문자 깨지네
		System.out.println(new String(b1, "949"));
		System.out.println(new String(b1, "EUC-KR"));	// 서로 문자포멧을 맞춰준다

		System.out.println("-------------------");
		
		String str2 = "봵"; //charset ????
		byte[] b2 = str2.getBytes("EUC-KR");
		
		System.out.println(new String(b2, "EUC-KR"));
		
		byte[] b3 = str2.getBytes("UTF-8");		//봵은 3byte짜리인 UTF-8을 써야 제대로 나오네
		
		System.out.println(new String(b3, "UTF-8"));
		
		/*
		 * for(byte st : b1) { System.out.println(st); }
		 */

//		ASCII - 1byte(8bit) -> 2 * 8 = 256  : a - 75, A- 97
//		UTF-8(Unicode) -3byte -> 2 * 24 -> 한자, 한글, 일본 모두 표현 가능
		
	}

}
