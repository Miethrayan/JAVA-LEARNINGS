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
	StringBuffer sb = new StringBuffer("Miethrayan");
	sb.append("Mike");
	sb.insert(2, "Miethfalse");
	System.out.println(sb);
	System.out.println(sb.reverse());
	System.out.println(sb.capacity());
}
}
