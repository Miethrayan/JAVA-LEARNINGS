package telusco_corejava;
//class A66 extends Thread{
//	public void run() {
//		
//		for(int i=1;i<=100;i++) {
//			System.out.println("hi");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}
//	
//}
//class B66 extends Thread {
//	public void run() {
//		
//		for(int i=1;i<=100;i++) {
//			System.out.println("hello");
//			
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}
class A66 implements  Runnable{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
class B66 implements  Runnable {
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Threads {

	public static void main(String[] args) {
//	A66 obj =new A66();
//	B66 obj1 =new B66();
//	
////	obj1.setPriority(Thread.MAX_PRIORITY);
//	
//	
//	obj1.start();
//	obj.start();
//	
	Runnable  obj =new A66();
	Runnable obj1 =new B66();
	
//	obj1.setPriority(Thread.MAX_PRIORITY);
	
	Thread t1 =new Thread(obj);
	Thread t2 =new Thread(obj1);
	
	t1.run();
	t2.run();
	
	
//	obj1.start();
//	obj.start();
//	
	
	}

}
