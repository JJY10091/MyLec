package tut03;

public class SwitchRand {

	public static void main(String[] args) {
		//dice
		//1 ~ 6
		//(int)(Math.random()*마지막값) + 시작값
		
		int dice = (int)(Math.random()*6) + 1;
	
		switch(dice){
			case 1:
				System.out.println("선택한 주사위 값은 1입니다.");
				break;

			case 2:
				System.out.println("선택한 주사위 값은 2입니다.");
				break;
			
			case 3:
				System.out.println("선택한 주사위 값은 3입니다.");
				break;
			
			case 4:
				System.out.println("선택한 주사위 값은 4입니다.");
				break;
			
			case 5:
				System.out.println("선택한 주사위 값은 5입니다.");
				break;
			
			case 6:
				System.out.println("선택한 주사위 값은 6입니다.");
				break;
			
			default:
				System.out.println("잘못된 값입니다.");
				break;
		}
		
		
	}
}
