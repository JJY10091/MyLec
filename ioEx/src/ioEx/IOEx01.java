// 사원가입(이미지), 게시판(이미지, 첨부파일) : 오늘 첨부파
// 입사일 : 년월일 구분

// 파일 생성
// 경로 구분자(seperator) \를인식하려면 \\ 2번 사용함

// 구현 코드
//		String file = "C:\\temp\\koreait.txt"; // c:/temp/koreait.txt 와 동일
//		File makeFile = new File(file);
//		try {
//			makeFile.createNewFile();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//			System.out.println("파일 생성에 예외가 발생했습니다.");
//		} // Exception(예외) 처리가 필요하다

package ioEx;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {
		// 파일이 존재하는지 확인 후
		// 파일을 생성하였습니다. or 존재합니다. => exists() - boolean
		// io -> open -> close

		try {
			 String filename = "c:\\temp\\KoreaIt.txt"; // -> 생성자에서 File.separator 이용해서
			
//			File file = new File("c:" + File.separator + "temp" + File.separator + "KoreaIt.txt"); // 만들 준비
			
			 File file = new File(filename);
			 if (!file.exists()) {
				boolean result = file.createNewFile(); // 생성
				if (result)
					System.out.println("파일이 생성되었습니다.");
	
			} else
				System.out.println("파일이 이미 존재합니다.");

			System.out.println(file.getAbsolutePath()); //파일 절대경로
			
			//작업(이클립스) 위치 출력
			System.out.println(System.getProperty("user.dir"));
			
		} catch (Exception e) { // 최상위 예외 Exception을 사용
			e.printStackTrace();
			System.out.println("파일 생성에 오류가 있습니다.");

		}

	}

}
