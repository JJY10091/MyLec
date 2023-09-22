package tut07;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {
		
		//Scanner를 이용해서 배열 생성 : 3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가입할 회원 수 > ");

		int count = sc.nextInt();
		Register[] user = new Register[count];
		
		for(int i = 0 ; i < user.length; ++i) {
			
			System.out.print("이메일 > ");
			String email = sc.next();

			System.out.print("비밀번호 > ");
			String pwd = sc.next();
			
			System.out.print("이름 > ");
			String name = sc.next();
			System.out.println("");

			user[i] = new Register(email,pwd,name);
			System.out.println( (i+1) +"번째 회원이 등록 되었습니다.");
			System.out.println("");
		}
		System.out.println("회원가입이 완료 되었습니다.");
		System.out.println("");
		System.out.println("-------회원출력---------");
		sc.close();

//		for(타입 별명 : 배열) {
//			출력코드(별명)
//		}
		
		for(Register reg : user) {
			System.out.println(reg.disp()); //이게 되네
		}
		
	}

}
