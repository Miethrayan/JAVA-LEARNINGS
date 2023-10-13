package telusco_corejava;
class A11{
	public void show1() {
		System.out.println("in A show");
	}
} 
class B11 extends A11{
	public void show2() {
		System.out.println("in B show");
	}
} 
public class Upcasting_Downcasting {
public static void main(String a[]) {
	A11 obj= (A11)new B11();//this is up casting
	obj.show1();

	//this is down casting
	B11 obj1=(B11)obj;
	obj1.show2();
	obj1.show1();
}
}
