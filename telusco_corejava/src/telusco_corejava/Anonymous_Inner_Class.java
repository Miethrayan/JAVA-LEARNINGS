package telusco_corejava;
class A3{
	public void show() {
		System.out.println("In A show ");
	}
}
public class Anonymous_Inner_Class {
public static void main(String a[]) {
	A3 obj=new A3() {
		public void show() {
			System.out.println("In new Show");
		}
	};	
	obj.show();
}
}
