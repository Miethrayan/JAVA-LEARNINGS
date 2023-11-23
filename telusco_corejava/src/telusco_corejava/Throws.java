package telusco_corejava;

public class Throws {

	public static void main(String[] args) {
		int p =0;
		int t=9;
		
		
		try {
			t= t/p;
			
			if (t==0) {
				throw new ArithmeticException("It won't divide by zero");
			}
		}
		catch(ArithmeticException e) {
			t=t/1;
		System.out.println("Cannot divide by 0"+" "+e);	
		}
		catch (Exception e) {
			System.out.println("Something went Wrong "+" "+e);
		}
		
		System.out.println("After try catch");
		
		
		
		
		
	}

}
