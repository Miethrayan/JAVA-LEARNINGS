package telusco_corejava;
 abstract class car{
	public abstract void drive();
	public void playMusic() {
		System.out.println("Playing Music");
	}
}
class WagonR extends car{
	public void drive() {
		System.out.println("driving");
	}
}
public class Abstract_class {
	public static void main(String a[]) {
		car obj=new WagonR();
		obj.drive();
		obj.playMusic();
	}

}
