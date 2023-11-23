package telusco_corejava;

class A1{
	public void show () 
	{
		System.out.println("in A show");
	}
}
class B14 extends A1{
	public void show (){
		System.out.println("in B show");
	}
}
class C1 extends A1{
	
}
public class Polymorphism {
public static void main(String a []) {
	A1 obj=new A1();
	obj.show();
	
	obj=new B14();
	obj.show();
}
}
