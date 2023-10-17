package lamda;

/*
  Hello
  World
  > Hello World
 */

//인터페이스 : 두 개의 문자열 매개변수
interface ConcatStr {
	void makeConcat(String str1, String str2);
}

//구현(클래스 - 생성자 가능) : 두 개의 문자열을 연결(+) - 강제 오버라이딩
class ConcatStrImpl implements ConcatStr{
	@Override
	public void makeConcat(String str1, String str2) {
		System.out.println(str1 +" "+ str2);
	}
}

public class LamdaEx6 {

	public static void main(String[] args) {
		//실행코드
		ConcatStrImpl csi = new ConcatStrImpl();
		csi.makeConcat("Hello", "World");	//이건 인터페이스 구현해서 사용 (람다식 아님)
		
		System.out.println("------------------");
		
		ConcatStr cs = (s1, s2) -> System.out.println(s1 +" "+ s2);
		
		cs.makeConcat("코리아아이티", "아카테미"); //이게 람다식
		
		//스프링에서 람다식 많이 사용
	}

}
