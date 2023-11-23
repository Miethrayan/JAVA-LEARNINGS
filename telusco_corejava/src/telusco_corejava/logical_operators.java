package telusco_corejava;

public class logical_operators {
	public static void main(String[]args) {
//	int a=5;
//	int b=9;
//	int c=8;
//	int d=86;
//	boolean result= a==c || a>6 || b<d;
//	
		
		
		int a =9;
		int b=80;
		int c= 86;
		int d =90;
		
		boolean result = a>b || a<b;
		boolean result1=a<b && a>b;
		boolean result2= a>b && b>a && c>b && d>c;
		boolean result3= a>b || b>a ||c>b || d>c;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	String s= "exam:"+9+9+9;
	System.out.println(s);
	
	int x = 5;
	int y =10;
	System.out.println(x);
	System.out.println(y);
	int z =(x++> 5 && y--<10)?x--:y;
	
	System.out.println(z);
	System.out.println(x);
	System.out.println(y);
	
	int i,j;
	i=100;
	j=3000;
	--i;
	--j;
	System.out.println(i);
	System.out.println(j);
//	while(++i<=--j);
//	System.out.println(i);
//	System.out.println(j);
//	
//	i++;
	
	
	}
	
	
	

}
