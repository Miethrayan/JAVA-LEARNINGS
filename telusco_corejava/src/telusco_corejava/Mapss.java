package telusco_corejava;

//import java.util.HashMap;
import java.util.*;

public class Mapss {

	public static void main(String[] args) {
		Map <String ,Integer> students= new  HashMap();
        students.put("Miethrayan", 89);
        students.put("tom", 90);
        students.put("sujel", 80);
        students.put("ramu", 88);
        students.put("suresh", 87);
        System.out.println(students);
        System.out.println(students.get("Miethrayan"));
        System.out.println(students.keySet());
        System.out.println(students.keySet());
	}

}
