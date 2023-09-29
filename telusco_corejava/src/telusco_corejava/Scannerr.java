package telusco_corejava;

import java.util.Scanner;

public class Scannerr {
	public static void main(String a[]) {
//		int number;
		Scanner nm=new Scanner(System.in);
		System.out.println("Type the number here");
		int ap =nm.nextInt();
		int f=1;
		
		for(int i=1;i<=ap;i++) {
			 f=f*i;
//			int g=1+f;
			System.out.println(f);
	}
}
}
