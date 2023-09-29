package telusco_corejava;

public class switch__ {
	public static void main(String[]args) {
		
	
//		String n= "ganesh";
//		
//	switch(n) {
//	
//	case "ram":
//	System.out.println("Monday");
//	break;
//	case "venkat":
//	System.out.println("Tuesday");
//	break;
//	case "som":
//	System.out.println("Wednesday");
//	break;
//	case "suhal":
//	System.out.println("Thursday");
//	break;
//	case "yash":
//	System.out.println("Friday");
//	break;
//	case "ganesh":
//	System.out.println("Saturday");
//	break;
//	case "ragu":
//	System.out.println("Sunday");
//	default:
//		System.out.println("no data");
//	}
//	
//	

//		String m="wednesday";
//		String result ="";
//		 result =switch (m) {
//		case "sunday","Monday" -> "7am";
//		case "wednesday" -> "8am";
//		default ->"9";
//		
		String ms="Wednesday";
		String result = "";
		result= switch (ms) {
		case "sunday", "Monday" -> "7am";
		case "tuesday", "Wednesday" -> "8am";
		default ->"9am";
		
		
		};
		System.out.println(result);
				
	}

}
