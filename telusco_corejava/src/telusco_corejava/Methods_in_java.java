package telusco_corejava;

class Computer{
	
	public void playMusic()
	{
		System.out.println("Music Playing");
		
		
	}
	
	public String getMeAPen(int cost)
	{
		if(cost>=9)
		 return "Pen";
	
			return "Nothing";
	}
}

public class Methods_in_java {
	public static void main(String a[]) {
		
		Computer obj=new Computer();
		obj.playMusic();
		Computer ob=new Computer();
	String str=	ob.getMeAPen(7);
	System.out.println(str);
		
	}

}
