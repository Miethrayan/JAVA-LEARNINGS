package telusco_corejava;
class A{
	public void Show() {
		System.out.println("In A show");
	}
}
class B extends A{
	@Override//its used to identify the overrideing 
	public void showw() {
		System.out.println("In B show");
	}
}

public class What_is_Annotation {

	public static void main(String[] args) {
	B obj=new B();
	obj.Show();
	}

}
