package telusco_corejava;
final class Calc{
	public final void show() 
	{
		System.out.println("in calc shwo");
	}
	public void add(int a,int b) 
	{
		System.out.println(a+b);
	}
}
class AdvCalc extends Calc{
	public void show() {
		System.out.println("its me");
	}
	
}
public class Final_Keywird {
public static void main(String a[]) {
	//Final in variable
//	final int num=8;
//	num=9;
//	System.out.println(num);

//final in method
AdvCalc obj=new AdvCalc();
obj.show();
obj.add(33, 3);

}
}
