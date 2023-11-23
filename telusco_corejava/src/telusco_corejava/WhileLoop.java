package telusco_corejava;

public class WhileLoop {
	public static void main(String[]args) {
		
		int i=1;
		do {
			System.out.println("Hello" +i);
			
			int j=0;
			while (j<3) {
				System.out.println("world" + j);
				j++;
			};
			i++;
			
			
		}
		while(i<0);
		
		
		
		
		
	}
	

}


