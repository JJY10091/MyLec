package ioEx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOEx02 {

	public static void main(String[] args) throws IOException {
		
		String folder = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
	
		File dir = new File("C:\\temp\\"+folder);
		//mkdir()
		
		if(!dir.exists()) {
			dir.mkdir();	//rmdir - 리무브dir
			System.out.println(folder+ "가 생성되었습니다.");
			
			//폴더 생성하면서 busan.txt도 같이 저장
			File file = new File(dir + "\\busan.txt");
			
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
			
		}else {
			System.out.println("디렉토리가 존재합니다.");
		}
		
		
//		System.out.println(folder.getAbsolutePath());
	}
}
























