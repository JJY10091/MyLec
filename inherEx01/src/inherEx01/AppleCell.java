package inherEx01;

public class AppleCell extends Cell{
	
	@Override
	void turnOn() {
		System.out.println("애플 전원을 켭니다.");
	}
	
	@Override
	void turnOff() {
		System.out.println("애플 전원을 끕니다.");
	}
}
