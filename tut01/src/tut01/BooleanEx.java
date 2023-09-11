package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		//컴퓨터는 0, 1 => false(거짓) 0
		//				 true(참) 0을 제외한 양수는 참

/*
		 
		 기본타입의 초기값 설정
		int i = 0; , 
		double d = 0.0;
		boolean b = false;
		String str = "";
		
*/
		boolean b = true;
		//참이면 통과, 아니면 재평가

		//equals() : String 값 비교
		//그 외 같은 걸 비교할 때는 ==
		//
//		if(b) 
//			System.out.println("통과");
//		else 
//			System.out.println("재평가");
		
		String result =( b )? "통과" : "재평가";
		System.out.println(result);
		
		//조건이 참이면 1 아니면 0을 출력하시오
		int ir = ( b )? 1 : 0;
		System.out.println(ir);
		
		//조건이 참이면 1.0 아니면 0.0을 출력하시오
		double dr = ( b )? 1.0 : 0.0;
		System.out.println(dr);
		
		//조건이 참이면 true 아니면 false을 출력하시오
		boolean br =(b)? true : false;
		System.out.println(br);
		
	}

}



















