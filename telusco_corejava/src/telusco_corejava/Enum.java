package telusco_corejava;

import java.util.Scanner;

enum Status{
	Running,Failed,Pending,Success
}

public class Enum {
public static void main(String []a) {
//	int i=5;
//	Status []ss=Status.values();
//	for (Status s:ss) {
//		System.out.println(s+":"+s.ordinal());
//	}
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Give your code here");
	int code =scanner.nextInt();
	
	
	if(code ==404) {
		System.out.println(Status.Failed);
	}
		
	else if (code ==200) {
			System.out.println(Status.Success);
		}
	 
	else if (code ==300) {
		System.out.println(Status.Pending);
	}
	
	else if (code ==198) {
		System.out.println(Status.Running);
	}
	
	
	
	
//	if ()
}
}
