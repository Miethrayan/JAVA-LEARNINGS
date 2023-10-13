package telusco_corejava;
class A2
{
int age=9;
public void show() 
{
System.out.println("show");
}
 static class B2
{
	public void config() {
		System.out.println("config");
	}
}
}	

public class inner_Class {
	public static void main(String a[]) {
		A2 obj=new A2();
		System.out.println(obj.age);
		obj.show();
		System.out.println("hi");
		A2.B2 obj1= new A2.B2 ();
		obj1.config();
	}
}
