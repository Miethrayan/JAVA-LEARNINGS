package telusco_corejava;
 abstract class Car{ //abstract class
	public abstract void drive();
		
	
	public void playMusic() {
		System.out.println("play music");
	};
	
	
};

//


class WagonR extends Car { //concrete class
	
	public void drive() {
		System.out.println("driving");
	};
	
	
	
};

//


public class Abstract_class {
	public static void main(String a[]) {
		Car obj=new WagonR();
		obj.drive();
		obj.playMusic();
	}

}
