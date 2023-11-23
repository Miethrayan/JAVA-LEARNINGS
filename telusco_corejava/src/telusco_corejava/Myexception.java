package telusco_corejava;
class Miethrayan extends Exception{
	public Miethrayan (String string) {
		super(string);
	}
}

public class Myexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=20;
int j=0;
try {
	j=18/i;
	if(j==0)
		throw new Miethrayan("I dont want 0");
}
catch(Miethrayan e) {
	j=18/1;
	System.out.println("Thats the default output"+ e);
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println(j);
System.out.println("bye");
	}

}
