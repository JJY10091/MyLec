package lamda;

interface MaxNum {
	int getMaxNum(int x, int y) ;
}

public class LamdaEx5 {

	public static void main(String[] args) {
		/*//1번 비교
		MaxNum max = (x, y) -> {
			if(x > y)
				return x;
			else
				return y;
		};
		
		System.out.println(max.getMaxNum(20, 250));
		*/
		
		/*  //2번비교
		MaxNum m1 = (a, b) -> {
			return (a > b) ? a:b;
		};
		System.out.println(m1.getMaxNum(400, 2050));
		*/
		 
		//중괄호 생략하기 : return 오류남 
		//3번 비교
		MaxNum m2 = (a,b) -> (a > b) ? a : b; 		//return 생략가능하네 
		System.out.println(m2.getMaxNum(20, 30));
		
	}

}
