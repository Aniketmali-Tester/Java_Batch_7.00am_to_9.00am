package Abstractionclass;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Student s;
	
	s=new EngineeringStudent();
	s.studentname="Arun";
	s.marks=86f;
	s.rollno=234567880l;
	
	s.StudentInfo();
	s.calculateScholarship();
	
	
	System.out.println("*********************************************************");
	
	
	s=new MBAStudent();
	s.studentname="john";
	s.marks=79f;
	s.rollno=234567880l;
	
	s.StudentInfo();
	s.calculateScholarship();
	}

}
