package telusco_corejava;
class Calculator{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2 +n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
	public  int  minus(int n1, int n2) {
		return n1-n2;
	}
}
public class Method_overloading {
	public static void main (String a[]) {
		
		Calculator obj=new Calculator();
				int r1 = obj.add(4, 7,5);
				
//				Calculator obj2=new Calculator();
				int r2=obj.minus(9, 8);
				int r3=r1+r2;
				System.out.println(r1+":"+r2);	
System.out.println(r3);
	}
	


}
