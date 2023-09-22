package list01;
import java.util.ArrayList;
import java.util.List;

class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {

		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : "+itemNum+", 상품명 : "+itemName+", 상품가격 : "+itemPrice+", 상품재고 : "+itemStock);
	}
	
	
}

class ItemDao{
	
	public List<Item> getItems() {
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(100100102L,  "IBM 노트북",2000000,11));
		aList.add(new Item(10123402L,   "게이밍 마우스",50000,999));
		aList.add(new Item(1002333102L, "LG LED",100000,100));
		
		return aList;
	}
}

public class ListEx03 {

	
	
	public static void main(String[] args) {
		//객체(Item) : 상품번호, 상품명, 가격, 재고
		
		/*
		System.out.println("등록된 상품은" +aList.size()+"개 입니다.");
		System.out.println("---------- for1 상품출력 ----------");
		for (int i = 0; i < aList.size(); ++i) {
			aList.get(i).itemDisp();
		}
		System.out.println("");
			
		*/
		
		ItemDao dao = new ItemDao();
		List<Item> list = dao.getItems();
		
		
		System.out.println("---------- for2 상품출력 ----------");
		for(Item item : list) {
			item.itemDisp();
		}
	}

}
