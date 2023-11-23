package telusco_corejava;
class Q{
	public void show() {
		System.out.println("in Show");
	};
	
	
};
public class Anonymous_Inner_Class {
public static void main(String a[]) {
Q obj = new Q() {
	public void show() {
		System.out.println("in new show");
	};

}; 

obj.show();


}
}
