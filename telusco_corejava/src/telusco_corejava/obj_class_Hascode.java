package telusco_corejava;

class Lap{
	
    String model;
	 int price;
	
	public String toString() {
		return "hey";
	};
	
	
};

public class obj_class_Hascode {
	public static void main(String a []) {
		
		Lap obj =new Lap() {};
		
		obj.model="yoga";
		obj.price=1000;
		
		
		System.out.println(obj.toString());
		
	};

}
