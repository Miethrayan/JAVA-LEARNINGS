package telusco_corejava;
class Huma{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String n){
		name=n;
	}
	public void setAge(int a){
		age=a;
	}
	
}
public class This {
public static void main(String a []) {
	Huma obj=new Huma();
	obj.setAge(22);
	obj.setName("Miethrayan");

System.out.println(obj.getAge());
System.out.println(obj.getName());

}
}
