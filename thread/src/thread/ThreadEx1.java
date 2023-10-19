package thread;

class HanCount extends Thread {

	@Override
	public void run() {
		String[] strArr = { "하나", "둘", "셋", "넷", "다섯" };
		
		try {
			Thread.sleep(10); // 한글이 조금 뒤에 나오게하려고 쓰는거같네
		}catch (InterruptedException e) {}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]+ " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ThreadEx1 {

	public static void main(String[] args) throws InterruptedException {
		//1 하나, 2 둘, 3 셋, 4 넷 ...
		
		int[] intArr = {1,2,3,4,5};
		HanCount hc = new HanCount();
		hc.start();
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+" ");
			Thread.sleep(500);			
		}
	}
}
	

