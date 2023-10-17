package lamda;


//disp()
interface MyLamda{
	void disp();
}


//람다식으로 화면 출력(sysout)
public class LamdaEx {

	public static void main(String[] args) {
		//화살표 함수 뒤에 중괄호는 출력 내용이 한줄일 때는 생략이 가능
		MyLamda m = () -> {
			System.out.println("람다식 이거 먼데");
		};
		 // 먼데
		m.disp();
		
		System.out.println("-------------------------------");
		
		MyLamda m2 = () -> System.out.println("중괄호 제거해서 람다식");
		m2.disp();
		
		System.out.println("-------------------------------");

		MyLamda m3 = () -> {
			String str = "변수로 만든 문자열, 2줄 코드";
			System.out.println(str);
		};
		m3.disp();
		
		
	
	}
	

}
