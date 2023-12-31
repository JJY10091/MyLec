package setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegisterDao {

	Set<Register> set = null;

	public RegisterDao() {
		set = new HashSet<>();
	}

	public void addRegister(Register rg) {
		set.add(rg);
	}

	// List index 번호로 구분 :get(i)
	// Set 값(객체)로 구분
	// Map key 구분

	/*
	 * public boolean deleteRegister(int num) { //for 2 for(Register r : set) {
	 * 
	 * if(num == r.getId()) { set.remove(r); return true; } } return false; }
	 */

	//
	public boolean deleteRegister(int num) {
		// Iterator

		Iterator<Register> ir = set.iterator();
		while (ir.hasNext()) {
			Register reg = ir.next();
			int tmp = reg.getId();

			if (tmp == num) {
				set.remove(reg);
				return true;
			}

		}

		return false;

	}

	public void showInfo() {
		// System.out.println("for2");
		for (Register r : set) {
			// System.out.println(r); //주소값이 출력
			r.disp();
		}

		/*
		 * System.out.println("Iterator는 While로 출력");
		 * 
		 * 
		 * Iterator<Register> ir = set.iterator(); while (ir.hasNext()) {
		 * ir.next().disp(); }
		 */
	}
}
