package telusco_corejava;
@FunctionalInterface
interface A9{
	int add(int i,int j);
}
public class Lambda_with_return {
public static void main(String a []) {
	A9 obj= ( i,  j ) -> i+j;

	
	int result=obj.add(5, 50);
	System.out.println(result);
}
}
