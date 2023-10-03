package telusco_corejava;

 class student{
	int marks;
	stringg name;
	int rollno;
}

public class Array_of_objct {
public static void main(stringg a[]) {
	student s1=new student();
	s1.rollno =1;
	s1.marks=98;
	s1.name="ragu";
	
	student s2=new student();
	s2.rollno =2;
	s2.marks=69;
	s2.name="sam";
	
	student s3=new student();
	s3.rollno =3;
	s3.marks=80;
	s3.name="balu";
	
	student students[]=new student[3];
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	
	for(student stud:students) {
		System.out.println(stud.name+": "+stud.marks+": "+stud.rollno);
	}
	
	
	
	
	
	
	
	
//	int nums []=new int[4];
//	nums [0]=4;
//	nums [1]=6;
//	nums [2]=7;
//	nums [3]=8;
//	
//	for (int i=0;i<nums.length;i++) {
//		System.out.println(nums[i]);
//		
//	}
}
}
