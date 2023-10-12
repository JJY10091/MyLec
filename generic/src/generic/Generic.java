package generic;

class Fruit3 {
	void fruit3() {
		System.out.println("과일입니다.");
	}
}

class Pencil3 {
	void pencil3() {
		System.out.println("연필입니다.");
	}
}

class Box3<T> { // <T> : 다이아몬드연산자 - 타입이 정해져있지 않다 -> Generic?
	 private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	 
	 
}

public class Generic {

	public static void main(String[] args) {
		Box3<Fruit3> box1 = new Box3<>();
		Box3<Pencil3> box2 = new Box3<>();
		
		box1.setT(new Fruit3());
		box2.setT(new Pencil3());
		
		Fruit3 f2 = box1.getT();
		System.out.println(f2);
		

	}

}
