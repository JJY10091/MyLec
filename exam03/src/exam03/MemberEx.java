package exam03;

import java.util.*;

public class MemberEx {

	public static void main(String[] args) throws Exception {
		MemberDao dao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		
		boolean run = false;
		while(!run) {
			int choice = dao.menu();
			
			switch(choice) {
			case 1: 
				List<Member> list = dao.getMember();
				if(list.isEmpty())
					System.out.println("등록된 회원이 존재하지 않습니다.\n");
				
				else {
					System.out.println("등록된 회원을 출력합니다.\n");
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				break;
			case 2:
				int result = dao.setMember();
				if(result > 0)
					System.out.println("회원가입이 완료 되었습니다.\n");
				else
					System.out.println("회원가입이 되지 않았습니다. \n관리자에게 문의하세요\n");
				break;
			case 3: 
				dao.disconnect();
				break;
		
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력하세요\n");
				
				continue;
			
			}
			
			
		}
		
		

	}

}
