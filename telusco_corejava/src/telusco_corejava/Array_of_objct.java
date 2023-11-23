package telusco_corejava;

// class student{
//	int marks;
//	String name;
//	int rollno;
//}

class Students
{
int rollno;
int marks;
String name;
};

public class Array_of_objct {
public static void main(String a[]) {
	
	
	
	
	Students s1=new Students();
	s1.marks=89;
	s1.rollno=22;
	s1.name="Mike";
	
	Students s2=new Students();
	s2.marks=89;
	s2.rollno=12;
	s2.name="Mike2";
	
	Students s3=new Students();
	s3.marks=89;
	s3.rollno=21;
	s3.name="Mike3";
	
	Students student[] = new Students [3];
	
	student[0]=s1;
	student[1]=s2;
	student[2]=s3;
	
	for (int i=0;i<3;i++) {
		System.out.println(student[i].marks+" "+student[i].name);
	};	
	
	
	
//	System.out.println(s3.marks);
	
//	student s1=new student();
//	s1.rollno =1;
//	s1.marks=98;
//	s1.name="ragu";
//	
//	student s2=new student();
//	s2.rollno =2;
//	s2.marks=69;
//	s2.name="sam";
//	
//	student s3=new student();
//	s3.rollno =3;
//	s3.marks=80;
//	s3.name="balu";
//	
//	student students[]=new student[3];
//	students[0]=s1;
//	students[1]=s2;
//	students[2]=s3;
//	
	for(Students stud:student) {
		System.out.println(stud.name+": "+stud.marks+": "+stud.rollno);
	}
	
	
	
	
//	System.out.println(students);
	
	
	
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
