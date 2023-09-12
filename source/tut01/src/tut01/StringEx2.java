package tut01;

public class StringEx2 {

	public static void main(String[] args) {
		//이메일 형식이 맞는지 체크하는 charAt("찾을값의 인덱스")
		String email = "mail@mail.com";
		System.out.println(email.length());
		
		//. => ~안에
		//System.out.println(email.charAt(4));
		if(email.charAt(4) == '@') 
			System.out.println("사용하셔도 되는 이메일 주소 입니다.");	
		else
			System.out.println("사용할 수 없는 이메일 주소입니다.\n다시 입력해 주세요");
		
		System.out.println("===================================");
		
		//replaceAll()
		
		String str = "korea it academy";
		System.out.println(str.length());
		
		System.out.println(str.replaceAll("it", "IT"));
		
		//주민번호를 이용해서 1이면 남자, 2면 여자로 화면에 표시하시오.
		String jumin = "001231-1234567";
		
		//변수명.substring(시작인덱스, 찾을값의인덱스+1)
		//System.out.println(jumin.length());
		//System.out.println(jumin.substring(7));
		//System.out.println(jumin.substring(7, 8));
		
		int gender = Integer.parseInt(jumin.substring(7,8));
		if(gender % 2 == 1)
			System.out.println("Male");
		else
			System.out.println("Female");
		
				
	}
}
