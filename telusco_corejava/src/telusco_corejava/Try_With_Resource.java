package telusco_corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Try_With_Resource {
	public static void main(String a[]) throws NumberFormatException, IOException {
		int num =0;
		BufferedReader b = null;
		try {
			InputStreamReader in=new InputStreamReader(System.in);
			b=new BufferedReader(in);
			num=Integer.parseInt(b.readLine());
			System.out.println(num);
			
		}
		finally{
			b.close();
		}
	}

}
