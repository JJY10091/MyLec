package inherEx01;

class Cals{
	//더하기, 빼기 동작
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	
}

class AdvCal extends Cals{
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	double div(int num1, int num2) {
		return (double)num1/num2;
	}
	
}

public class InherEx02 {

	public static void main(String[] args) {
		Cals cal = new Cals();
		System.out.println(cal.plus(1, 2)); 
		System.out.println(cal.sub(5, 2));
		
		System.out.println("-----------------");
		
		AdvCal ac = new AdvCal();
		System.out.println(ac.plus(3, 3));
		System.out.println(ac.sub(6, 3));
		System.out.println(ac.mul(3, 4));
		System.out.println(ac.div(5, 3));
		
	}

}
