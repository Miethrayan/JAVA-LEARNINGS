package telusco_corejava;
@FunctionalInterface
interface A0{
	
	void show();
	void show1();
}

public class Functional_Interface {
public static void main(String a []) {
	
	A0 obj = new A0() {
		
		public void show() {
			System.out.println("in Show");
		};
	};

obj.show();

}
}
