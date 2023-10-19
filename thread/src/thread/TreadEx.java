package thread;

public class TreadEx {

	public static void main(String[] args) throws InterruptedException {
		// System.out.println(Runtime.getRuntime().availableProcessors());
		// 1 하나, 2 둘, 3 셋, 4 넷, 5 다섯
		// 배열로 Single Thread

		int[] intArr = new int[] { 1, 2, 3, 4, 5 };
		String[] strArr = new String[] { "하나", "둘", "셋", "넷", "다섯" };

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			Thread.sleep(1000);
		}

		System.out.println("=========================");

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			Thread.sleep(1000);
		}

	}

}

