package thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		//글자 출력
		 Thread t1 = new Thread( ()->{
			 String [] strArr = {"하나","둘","셋","넷","다섯"};
			 
			 try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 for(int i = 0; i < strArr.length; i++) {
				 System.out.println(strArr[i]);
				 try {
					 Thread.sleep(500);
					 
				 }catch(InterruptedException e) {
					 e.printStackTrace();
				 }
			 }
		 } );
		 
		 Thread t2 = new Thread( new Runnable () {

			public void run() {
				int[] intArr = new int[] {1,2,3,4,5};
				
				for(int i = 0; i < intArr.length; i++) {
					System.out.println(intArr[i]);
					
					try {
						Thread.sleep(500);
					}catch(InterruptedException ie) {
						ie.printStackTrace();
					}
					
				}
				
				
			}});
		 
		 //쓰레드 우선순위 : 10(높음) ~ 1(낮음) -> 5(지정안함)
//		 System.out.println("쓰레드 이름은 : "+t1.getName());
//		 t1.setPriority(10);
		 System.out.println(t1.getPriority()); //우선순위 확인
		 t1.start();
		 
//		 System.out.println("쓰레드 이름은 : "+t2.getName());
//		 t2.setPriority(1);
		 System.out.println(t2.getPriority());
		 t2.start();
		 
	}

}
