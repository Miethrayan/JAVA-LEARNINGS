package telusco_corejava;
import java.util.*;



class Students12 {
	
	
	int age;
	String name;
	
	public Students12(int age, String name) {
	
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}
	
	
}
public class compqrqtor_comprable {

	public static void main(String[] args) {
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			public int compare (Integer i,Integer j) {
				if (i%10 > j%10)
					return 1;
				else
					return -1;
			};
			
			
		};
		
		
		List <Students12> studs = new ArrayList();
		studs.add(new Students12(21,"mike"));
		studs.add(new Students12(20,"mokka"));
		studs.add(new Students12(22,"monish"));
		studs.add(new Students12(20,"mera"));
		studs.add(new Students12(25,"sam"));
		
//		Collections.sort(nums, comp);
		for(Students12 s : studs) {
		System.out.println(s);}
		
//		Collections.sort(nums);
		
//		System.out.println(nums);
		

	}

}
