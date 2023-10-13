package telusco_corejava;
class AB
{
	public void show() {
		System.out.println("in show");
	}
	public void config() {
		System.out.println("in AB config");
	}
	
}
class B1 extends AB
{
	public void show() {
		System.out.println("in B show");
	}
}
class C extends B1{
	public void show() {
		System.out.println("in C show");
	}
}

public class Method_Overriding {
public static void main(String a[]) {
	C obj=new C();
	obj.show();
	obj.show();
	obj.config();
}
}
