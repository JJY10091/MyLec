package jdbcPrj05;

import java.util.*;

public class MemberEx {

	public static void main(String[] args) throws Exception {
		MemberDao dao = new MemberDao();
		
		
		boolean run = false;
		while(!run) {
			int choice = dao.menu();
			
			switch (choice) {
			case 1:
				List<Member> list = dao.getMembers();
				//if( list.size() == 0)
				if(list.isEmpty()) {
					System.out.println("가입된 회원이 없습니다.");
				}else {
					System.out.println("가입된 회원은 " +list.size() +"명 입니다.");
					for(Member m : list) {
						System.out.println(m.toString());
					}
				}
				
				
				break;
				
			case 2:
				int result = dao.setMember();
				if(result > 0)
					System.out.println("회원가입이 완료 되었습니다.");
				else
					System.out.println("회원가입이 되지 않았습니다. \n관리자에게 문의하십시오.");
				break;
				
			case 3:
				dao.updateMember(0);
				break;
				
			case 4:
				dao.deleteMember(0);
				break;
				
			case 5: 
				dao.searchMember(0);
				break;
				
			case 6:
				dao.disconnect();
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			
			}
		}
	}

}
