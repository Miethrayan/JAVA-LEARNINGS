package telusco_corejava;

public class Inheritance {
	public static void main(String a[]){
	
		VeryAdvCalcu obj= new VeryAdvCalcu();
int r1=obj.add(5, 9);
int r2=obj.sub(15, 9);
int r3=obj.multi(5, 9);
int r4=obj.div(15, 10);
double r5=obj.power(4, 2);

System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
}
}