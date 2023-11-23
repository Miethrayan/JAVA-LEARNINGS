package telusco_corejava;
interface A22{
	int age=21;
	String area="Mumbai";
	void show();
	void config();
	public int  confi(int b) {
		return 1*b;
	};
}
class B22 implements A22{

	public int  confi();
	public void show() {
		System.out.println("In B show");
		
	}

	
	public void config() {
		System.out.println("In B config");
		
	}
	
}

public class Interface {

	public static void main(String a[]) {
		A22 obj;
		obj=new B22();
		obj.config();
		obj.show();
System.out.println(A22.age+" "+A22.area);
	}

}
