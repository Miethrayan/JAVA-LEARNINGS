package telusco_corejava;
//class A66 implements  Runnable{
//	public void run() {
//		
//		for(int i=1;i<=1000;i++) {
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
//class B66 implements  Runnable {
//	public void run() {
//		
//		for(int i=1;i<=1000;i++) {
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


class Counter{
	int count;
	public synchronized void increment() {
		
		count++;
		
	}
}


public class Race_condition {
public static  void main(String a[]) throws InterruptedException {
	
	Counter c = new Counter();
	

	Runnable  obj =()->{
		for(int i=1;i<=1000;i++) {
			
	c.increment();	
			
			
		}
	};
	
	Runnable obj1 =()->{
		for(int i=1;i<=1000;i++) {
			
			c.increment();
			
		}
	};
	
	
	
		
	
	
	
	Thread t1 =new Thread(obj);
	Thread t2 =new Thread(obj1);
	
	t1.start();
	t2.start();
	t2.join();
	t2.join();
	
	System.out.println(c.count);
}
}
