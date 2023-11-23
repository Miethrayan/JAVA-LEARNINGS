package telusco_corejava;
class Human1{
	private int age;
	private String name;
	
	public Human1() {
		age=12;
		name="Mike";
	}

	public Human1(int a, String n) {
		age=a;
		name=n;
	};
	
	
	public String getName() {
		return name;
		}
	
	public int getAge() {
		return age;
	}
}
public class Default_Parameterized_Constructors {
	public static void main(String a []){
Human1 obj=new Human1();
Human1 obj1=new Human1(21,"Mike");
System.out.println(obj.getAge()+" "+obj.getName());
System.out.println(obj1.getAge()+" "+obj1.getName());
}
}