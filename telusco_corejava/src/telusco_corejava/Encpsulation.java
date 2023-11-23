package telusco_corejava;

class Humann{
	
	
	
	private int age;
	 private String name;
	
	public void setName(String nme) {
		name=nme;
	};
	public void setAge(int ag) {
		age=ag;
	};
	public int getAge() {
		return age;
	};
	public String getName() {
		
		
		return name;
	};
	
	
};


public class Encpsulation {
public static void main(String a []) {
	Humann obj =new Humann();
	obj.setAge(21);
	obj.setName("Miethrayan");
	
	
	System.out.println(obj.getAge()+" "+obj.getName());
	

	
}
}
