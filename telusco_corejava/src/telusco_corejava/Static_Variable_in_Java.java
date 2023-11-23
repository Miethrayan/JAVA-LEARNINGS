package telusco_corejava;
//class Mobile{
//String brand;
//int price;
// static String type;
//
//public void show() {
//	System.out.println(type+brand+price);
//}	
//}

class Mobile{
	
	String brand;
	int price;
	String network;
	String name;
	
	public void show() {
		System.out.println(name +" "+brand+" "+price);
	};
	
};



public class Static_Variable_in_Java {
public static void main(String a []) {
	
//Mobile obj1=new Mobile();
//obj1.brand="Apple";
//obj1.price=1700;
//Mobile.type="Smart Phone";
//
//Mobile obj2=new Mobile();
//obj2.brand="redmi";
//obj2.price=170;
//Mobile.type="Smarter Phone";
//
//obj1.show();
//obj2.show();
	
	Mobile obj1=new Mobile();
	obj1.brand="apple";
	obj1.name="smart Phone";
	obj1.price=90_000;
	
	Mobile obj2=new Mobile();
	obj2.brand="samsung";
	obj2.name="smart Phone";
	obj2.price=70_000;
	
	obj1.show();
	obj2.show();
	
	
	
	Mobile mobil[]=new Mobile[2];
	mobil[0]=obj1;
	mobil[1]=obj2;
	
	for (Mobile mob :mobil) {
		System.out.println(mob.brand+" "+mob.name);
	}
	
	
}
}