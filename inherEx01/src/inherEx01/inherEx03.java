package inherEx01;

public class inherEx03 {

	public static void main(String[] args) {
		//interface, abstract -> 객체 생성해서 사용 X (new X)
		//  본체({} x)
		
		Std s = new Std();
		s.eat();
		s.study();
		s.stdID = "A200100001";
		s.name = "홍길동";
		s.age = 20;
		System.out.println("학번 : "+s.stdID+" | 이름 : "+s.name+" |  나이 : "+s.age);
		s.sleep();
		System.out.println("---------------------");
		
		Emp e = new Emp();
		e.eat();
		e.work();
		e.empID = "100500004";
		e.name = "나출근";
		e.age = 30;
		System.out.println("학번 : "+e.empID+" 이름 : "+e.name+" 나이 : "+e.age);
		e.sleep();
		
	}

}
