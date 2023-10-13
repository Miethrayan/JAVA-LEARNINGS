package telusco_corejava;

import java.nio.Buffer;

public class String_Buffer_Builder {


public static void main(String a[]){
	
//	String name="Mike";
//	StringBuffer sb=new StringBuffer();
//	sb.append(name);
//	System.out.println(sb.reverse());
//
//	
	StringBuffer sb=new StringBuffer("Mike");
	sb.append("Mieth");
	sb.insert(2, "Java");
System.out.println(sb.reverse());
	
}
}
