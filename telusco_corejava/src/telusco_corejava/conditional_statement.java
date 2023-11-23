package telusco_corejava;
class Class1{
	public int sum(int num1,int num2) {
		return num1*num2;	
		};
};

public class conditional_statement {
	public static void main(String[]args) {
//	
//		int e =8;
//		
//		if(e>=5 && e<=7)
//		System.out.println("hello");
//		else
//			
//		System.out.println("sorry the contdition is not satisficed");
		
		int a1 = 80;
		if (a1>70 && a1<=80) {
			System.out.println("Its greater than 70 and smaller than 80");
		}
		
		
		
//	if ,elseif ,else	
		int a =13;
		int b =11;
		int c =14;
		
		
		
		
		if (a>b && a>c) {
			System.out.println("a is bigger than all ");
		}
		else if (b>c && b>a) {
			System.out.println("b is bigger than all");
		}
		else 
			System.out.println("c is bigger than all ");
		
//		if(a>b && a>c) 
//		System.out.println(a);
//		
//		else if (b>a && b>c)
//		System.out.println(b);
//		
//		else 
//			System.out.println(c);
		
//		Class1 obj=new Class1();
//		int result =obj.sum(6, 0);
//		if(result ==24) {
//			System.out.println(result);
//		}
//		else
//			System.out.println("its not our expected output");
//		
		
		Class1 obj =new Class1();
	int result=obj.sum(4, 8);
		
		
		
		 result = result == 32 ? 90 :34 ;
		 System.out.println(result);
		
//		if (result ==24) {
//			System.out.println("Its expected one ");
//		}
//		else 
//			System.out.println("its not expected");
	
	}

}
