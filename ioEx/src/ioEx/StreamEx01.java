	/*
		입출력
		1. (1)byte : 텍스트, 파일, 이미지는 byte로 쪼개서 전송
		  (1) OutputStream / InputStream
		  		 쓰기			읽기
		  		 
		2. char : 텍스트 전용
		
		버퍼, 캐시 메모리(L1, L2) => 속도 향상
		버퍼 : 어느 정도 자료를 모아서 보낸다
		 자료
		 버퍼 비움(flush)
		 close 
	*/
		
package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		
		//파일 생성
		String filename = "koreait.txt";
		File f = new File("C:\\temp\\"+filename);	//준비
		
		
		//파일생성+글쓰기 : OutputStream = FileOutputStream // : OutputStream을 사용할때는 
														 //createNewFile을 해주지않아도 파일을 만든다
		
		//OutputStream : 쓰기 - 헷갈리지X
		OutputStream os = new FileOutputStream(f); // 파일이 생성됨
		os.write('K');	//쓰기	
		os.write('o');	
		os.write('r');	
		os.write('e');	
		os.write('a');	
		os.write('i');	
		os.write('t');	
		
		os.flush();	//버퍼 채워넣기
		os.close();	//닫기
		
		
		
	}

}


















