package inherEx01;

public class AndroidCell extends Cell{

	@Override
	void turnOn() {
		System.out.println("안드로이드 전원을 켭니다.");
	}
	
	@Override
	void turnOff() {
		System.out.println("안드로이드 전원을 끕니다.");
	}
}
