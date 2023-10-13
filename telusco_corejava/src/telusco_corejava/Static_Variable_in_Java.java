package telusco_corejava;
class Mobile{
String brand;
int price;
 static String type;

public void show() {
	System.out.println(type+brand+price);
}	
}
public class Static_Variable_in_Java {
public static void main(String a []) {
	
Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=1700;
Mobile.type="Smart Phone";

Mobile obj2=new Mobile();
obj2.brand="redmi";
obj2.price=170;
Mobile.type="Smarter Phone";

obj1.show();
obj2.show();
}
}