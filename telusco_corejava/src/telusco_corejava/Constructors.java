package telusco_corejava;
class Human{
	private int age;
	private String  name;
	
	public Human(){
		age=22;
		name="Mike";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
public class Constructors {
	public static void main(String a []) {
Human obj=new Human();
//obj.setAge(21);
//obj.setName("Miethrayan");
System.out.println(obj.getAge()+" "+obj.getName());

}
}
