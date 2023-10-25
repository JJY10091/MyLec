package exam02;

public class Exam03 {
	
	public static void main(String[] args) {
		String jumin = "001234-1234567";
		
		int gender = Integer.parseInt( jumin.substring(7, 8));
		
		if(gender % 4 == 1 || gender % 4 == 3)
			System.out.println("남자");
		else
			System.out.println("여자");
	}
}
