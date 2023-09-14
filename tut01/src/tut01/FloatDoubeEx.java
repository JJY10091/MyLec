package tut01;

public class FloatDoubeEx {

	public static void main(String[] args) {
		//부동소수점 오차
		//float  F,f 7자리 넘어가면
		float f = 1.0000001F;
		System.out.println(f);
		
		float f2 = 1.00000001F;
		System.out.println(f2);
		
		//double 15자리 넘어가면
		double d = 1.000000000000001;
		System.out.println(d);
		
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
		
		
	}

}
