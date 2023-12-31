package emp;

import java.util.Scanner;

import emp.service.EmployeeSrv;

public class EmployeeEx {

	public static void main(String[] args) {
		EmployeeSrv srv = new EmployeeSrv();
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			srv.menu();
			System.out.print("선택 >");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				srv.empCreate();
				break;
			
			case 2:
				srv.empAdd();
				break;
			
			case 3:
				srv.empList();
				break;
			
			case 4:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				System.out.println("");
				break;
			
			default:
				System.out.println("잘못된 메뉴 선택입니다..");
				System.out.println("");
				break;
					
			}
			
		}
		sc.close();
	}
}
