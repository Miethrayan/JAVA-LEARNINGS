package telusco_corejava;

public class Wrapper_Class {
public static void main(String a []) {
	int num=7;
	Integer num1=num;//auto-boxing.../storing primitive value in object.Integer =object is called auto-boxing.
	System.out.println(num);
	
	int num2=num1;//auto-unboxing which is opposite side to auto boxing.
	System.out.println(num2);
	
	String str="55";
	int num3=Integer.parseInt(str);
	System.out.println(num3*12);
}
}
