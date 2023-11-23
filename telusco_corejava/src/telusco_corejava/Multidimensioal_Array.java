package telusco_corejava;

public class Multidimensioal_Array {
public static void main(String a[]) {
//	int nums[][]=new int[3][4];
//	nums [1][0]= 4;
//	nums [0][0]=7;
////	nums[][]= (int)(Math.random() *10);
//	
//	for(int i=0;i<3;i++)
//	{
////		System.out.println("hi");
//		for(int j=0;j<4;j++) {
//			
//			System.out.print(nums[i][j] + "  ");
//		}
//		System.out.println();
//	}
	
	int nums [][]=new int [3][5];
//	nums[0][1]=7;
//	nums[0][4]=8;


	for (int i=0;i<3;i++) 
	{
		for (int j=0;j<5;j++) 
		{
			nums[i][j]=(int)(Math.random()*10);
//			System.out.print(nums[i][j]+" ");
		};
		
//		System.out.println(" ");
	};
	
	
	for (int i=0;i<3;i++) 
	{
		for (int j=0;j<5;j++) 
		{
//			nums[i][j]=(int)Math.random()*10;
			System.out.print(nums[i][j]+" ");
		};
		
		System.out.println(" ");
	};
//	System.out.println();
	
}
}
