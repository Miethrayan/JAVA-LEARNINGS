package telusco_corejava;
class Mobile3{
	
	int price ;
	 static String name ;
	String brand;
	
	public void show() {
		System.out.println(brand+" "+name+" "+" "+price);
	};
	
	
};


public class Static_Block {
public static void main(String a []) {
	
	
	Mobile3 obj1=new Mobile3();
	obj1.brand="Samsung";
	obj1.price=80_000;
	obj1.name="Miethrayan";
	
	obj1.show();
	
	
	
	
};
}
