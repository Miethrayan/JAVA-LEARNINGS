package telusco_corejava;
class Mobile{
	String brand;
	static int price;
	static String Name;
	public void show() {
		System.out.println(brand + price+ Name);
	}
	
	
}
public class Static_Variable_in_Java {
public static void main(String a []) {
	

	
//	Mobile obj1=new Mobile();
//	obj1.brand="Realme";
	Mobile.price=15000;
	Mobile.Name="smart phone";
	
	
	Mobile obj2=new Mobile();
	obj2.brand="Apple";
	obj2.price=17000;
	obj2.Name="smart phone";
	
	obj1.price=9000;
obj1.show();
obj2.show();

}
}