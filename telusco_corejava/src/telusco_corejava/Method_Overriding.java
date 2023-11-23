package telusco_corejava;
class AB
{
	public int show(int n,int r) {
		return n+r*2;
//		System.out.println("in B show");
	}
	public void config() {
		System.out.println("in AB config");
	}
	public int show(int n) {
		return n*2;
//		System.out.println("in B show");
	}
}
	

class B1 extends AB
{
	public void config() {
		System.out.println("in b config");
	}
	public int show(int n) {
		return n*2;
//		System.out.println("in B show");
	}
}
class C extends B1{
	public void config() {
		System.out.println("in c config");
	}
	public void show() {
		System.out.println("in C show");
	}
}

public class Method_Overriding {
public static void main(String a[]) {
	C obj=new C();
	obj.show();
	int re =obj.show(5,7);
	obj.config();
	System.out.println(re);
}
}
