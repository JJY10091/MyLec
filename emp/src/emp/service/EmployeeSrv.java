package emp.service;

import java.util.Scanner;

import emp.vo.Employee;

public class EmployeeSrv {

	Scanner sc = new Scanner(System.in);
	Employee[] emp = null;

	public void menu() {
		System.out.println("********** Welcom To Employees System*********");
		System.out.println("1.사원생성"); // create
		System.out.println("2.사원등록"); // add
		System.out.println("3.사원목록"); // list
		System.out.println("4.Exit");
	}

	public void empCreate() {
		System.out.println("사원 생성 페이지");
		System.out.println("");

		System.out.print("등록할 사원 수 > ");
		int count = sc.nextInt();
		emp = new Employee[count];
		System.out.println(emp.length + "명의 사원을 등록할 수 있습니다.");
		System.out.println("");
	}

	public void empAdd() {
		System.out.println("사원 등록 페이지");
		System.out.println(emp.length + "명의 사원을 등록합니다.");
		System.out.println("");

		for (int i = 0; i < emp.length; ++i) {
			emp[i] = new Employee(10001L, "인사과", "홍길동", 1000000);
		}
		System.out.println("사원이 등록 되었습니다.");
	}

	public void empList() {
		System.out.println("사원 목록 페이지");
		System.out.println();
		System.out.println(emp.length + "명의 사원 목록을 출력합니다.");
		
		/*
		  for(출력타입 별명 : 배열) { 출력코드(별명); }
		 */
		for(Employee person : emp) {
			System.out.println(person);
			System.out.println("------------------");
		}
		
	}

}
