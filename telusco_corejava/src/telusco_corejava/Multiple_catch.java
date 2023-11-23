package telusco_corejava;

public class Multiple_catch {

	public static void main(String[] args) {
	int k=0;
	int j=0;
	int nums[]=new int[5];
	nums[3]= 8;
	try
	{
		j=18/k;
		System.out.println(nums[3]);
		System.out.println(nums[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array went wrong"+e);
	}
	catch(Throwable e)
	{
		System.out.println("Something went wrong" + e);
	}
	System.out.println(j);
	}

}
