package telusco_corejava;

public class Try_Catch {
public static void main(String a []) {
	int k=0;
	int j=0;
	try
	{
	j=18/k;
	}
	catch (Exception e)
	{
		System.out.println("There is a error"+" "+e);
	}
	System.out.println(j);
	System.out.println("Bye");
}
}
