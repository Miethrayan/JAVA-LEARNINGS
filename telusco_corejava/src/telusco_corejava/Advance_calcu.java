package telusco_corejava;

public class Advance_calcu extends Calcu_inheritance {
	public int multi(int n1,int n2) {
		return n1*n2;
	}
	public int div(int n1,int n2) {
		return n1/n2;
	}
public static void main(String a []) {
	Advance_calcu obj=new Advance_calcu();
	int ab=obj.add(8, 6, 6);
	int abc=obj.sub(8, 8,5);
	int ac=obj.div(8, 8);
	int bc=obj.multi(8, 8);
	
	
	
	System.out.println(ab+":"+abc+":"+ac+":"+bc);
}
}
