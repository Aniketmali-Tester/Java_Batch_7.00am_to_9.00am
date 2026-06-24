package Abstractionclass;

public abstract class Student {
	
	
	
	//Declare Instance Variable
	
	String studentname;
	long rollno;
    float marks;
	
	//Abstract Method
	abstract void calculateScholarship();
	
	//concrete Method
	void StudentInfo()
	{
		
		System.out.println("Student name is : "+studentname);
		System.out.println("Student roll no: "+rollno);
		System.out.println("Student Marks : "+marks);
		//System.out.println("Scholarship Amount : "+);
		
	}

}
