package telusco_corejava;
@FunctionalInterface
interface A8{
	void show(int num,int k);
}

public class Lambda_Expression {

	public static void main(String[] args) {
//		A8 obj=new A8() {
//			@Override
//			public void show() {
//				System.out.println("in show A");
//				
//			}
//		};
//		obj.show(); instead of this we use lambda expression.
		
		
//		A8 obj=() -> System.out.println("in show A8");
//			obj.show();

		
//		A8 obj =new A8() {
//			@Override
//			public void  show () {
//				System.out.println("in show");
//			}
//		};
//		obj.show(8);
		
		A8 obj1 =(num,k)->System.out.println("in lambda show"+" "+ num);
		obj1.show(9,8);
		
		
		
		
		
	}

}
