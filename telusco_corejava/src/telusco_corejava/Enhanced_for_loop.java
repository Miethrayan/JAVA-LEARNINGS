package telusco_corejava;

public class Enhanced_for_loop {
public static void main(String a[]) {
	

	int nums []=new int [4];
	nums[0]=12;
	nums[1]=11;
	nums[2]=14;
	nums[3]=15;
//for (int i=0; i<nums.length;i++) {
//System.out.println(nums[i]);
//}
	
	for (int n:nums) {
		System.out.println(n);
	}
}
}
