package telusco_corejava;
class A {
	public A() {
		super();
		System.out.println("in A");
	}
	public A(int n) {
		super();
		System.out.println("in A int");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("in B");
	}
	public B(int N) {
		super();// calls the constructor of super class.
		System.out.println("in B int");
	}
}
public class This_Super {
	public static void main (String a []) {
		B obj=new B(7);
//		A obj1=new A(5);
	
	}

}
