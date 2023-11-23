package telusco_corejava;

interface A{
	int age =23;
	String area ="Mumbai";
	void show();
	void config();
}

interface X{
	void show();
	void run();
}


interface Y extends X{
	
	
}



class B implements A,Y{
	public void show () {
		System.out.println("in B  show ");
		
	}
	
	
	
	public void config() {
		
		System.out.println("In b config");
		
	}
	
	
	public void run() {
		System.out.println("in B run");
	}
}



public class Interface2 {
public static void main(String a []) {
	
}
}
