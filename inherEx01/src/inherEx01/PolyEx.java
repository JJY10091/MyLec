package inherEx01;

class OSystem {
	void run() {	//운영체제 실행 메소드
		System.out.println("운영체제를 시작합니다.");
	}
}

class LinuxEx extends OSystem {

	@Override
	void run() {
		System.out.println("Linux 운영체제를 시작합니다.");
	}
	
}

class AppleEx extends OSystem {
	@Override
	void run() {
		System.out.println("Apple 운영체제를 시작합니다.");
	}
}

class Microsoft extends OSystem {
	@Override
	void run() {
		System.out.println("Microsoft 운영체제를 시작합니다.");
	}
}

//다형성
class OsStart { 
	//부모(os)는 자식(linux, apple, ms) 다 포함(담을) 수 있다. -> 다형성
	
	void start(OSystem os) { //매게변수로 부모클래스를 넣어보자 -> 자식을 넣을수가 있음
		os.run();
	}
}


public class PolyEx {

	public static void main(String[] args) {
/*		
 		LinuxEx linux = new LinuxEx();
		linux.run();
		System.out.println("--------------------");
		
		AppleEx apple = new AppleEx();
		apple.run();
		System.out.println("--------------------");

		Microsoft micro = new Microsoft();
		micro.run();
*/
		
		//다형성적으로 ...
		OsStart boot = new OsStart();

//		LinuxEx linux = new LinuxEx();
//		boot.start(linux);
		
		boot.start(new LinuxEx());
		boot.start(new AppleEx());
		boot.start(new Microsoft());
		
		
	}

}
