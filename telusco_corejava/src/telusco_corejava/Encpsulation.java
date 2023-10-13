package telusco_corejava;

class Human{
	private int age;
	private String  name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public String getName() {
		return name;
	}
	public void setName(String nam) {
		name = nam;
	}
	

}


public class Encpsulation {
public static void main(String a []) {
	
	
	Human hm=new Human();
	hm.setAge(22);
	hm.setName("Miethraya");
	System.out.println(hm.getAge()+hm.getName());
	
}
}
