package emp.vo;

import java.time.LocalDate;

public class Employee {
	// 필드
	// 생성자 : 기본, 매개변수
	// get,set
	// 출력메소드

	private Long id;
	private String depart;
	private String name;
	private int salary;
	private LocalDate startDate;
	private LocalDate endDate;

	public Employee() {
	}

	public Employee(Long id, String depart, String name, int salary) {
		this.id = id;
		this.depart = depart;
		this.name = name;
		this.salary = salary;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	@Override
	public String toString() {
		return "사번 : "+id+", 부서 : "+depart+", 이름 : "+name+", 급여  : "+salary;
	}

}
