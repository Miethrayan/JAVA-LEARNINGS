package telusco_corejava;
class Mobile2{
	
	String name;
	String brand;
	int price;
	public void show() {
		
		System.out.println(name+":"+price+":"+brand);
	}
	public static void show1(Mobile2 obj) {
		
		System.out.println(obj.name+":"+obj.price+":"+obj.brand);
	}
	
}
public class Static_Method {

	public static void main(String a []) {
		
		Mobile2 obj1=new Mobile2();
		obj1.name="Smartphone";
		obj1.brand="Realme";
		obj1.price=15000;
		
		Mobile2 obj2=new Mobile2();
		obj2.name="Smartphone";
		obj2.brand="Apple";
		obj2.price=80000;
		
//		obj1.show();
//		obj2.show();
		
		Mobile2.show1(obj1);
		Mobile2.show1(obj2);
		
	}

}
