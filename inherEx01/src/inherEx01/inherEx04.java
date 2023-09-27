package inherEx01;

public class inherEx04 {

	public static void main(String[] args) {
		//생성자를 이용해서 모델, 색상을 저장 후 출력
		
		Phone p1 = new Phone("KT","Black");
		p1.turnOn();
		p1.disp();
		p1.turnOff();
		
		System.out.println("--------------------------");
		//Android.java
		//model, color, company -> 생성자
		
		Android ad = new Android("Galaxy","Sliver","SAMSUNG");
		ad.disp();
		
		
	}
}
