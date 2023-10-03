package telusco_corejava;

class Computer{
	
	public void   playMusic()
	{
		System.out.println("Music Playing");
		
		
	}
	
	public stringg getMeAPen(int cost)
	{
		if(cost>=9)
		 return "Pen";
		
			return "Nothing";
	}
}

public class Methods_in_java {
	/**
	 * @param a
	 */
	public static void main(stringg a[]) {
		
		Computer obj=new Computer();
		 obj.playMusic();
		Computer ob=new Computer();
	stringg str=	ob.getMeAPen(7);
	System.out.println(str);
		
	}

}
