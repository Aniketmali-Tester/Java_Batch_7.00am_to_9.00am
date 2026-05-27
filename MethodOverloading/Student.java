package MethodOverloading;

public class Student {
	
	
	String Studentname="Arun";
    long Rollno=621516114031l;
    
    
    //Method overload
    void Searchstudent(String name)
    {
    	if(name.equalsIgnoreCase(Studentname))
    	{
    		
    		System.out.println("Student name is : "+Studentname);
    		System.out.println("Student roll no is : "+Rollno);
    	}
    	else
    	{
    		
    		System.out.println("Ivalid Statement");
    	}
    }
    
      void Searchstudent(long rollno)
    {
    	if(rollno==Rollno)
    	{
    		System.out.println("Student roll no is : "+Rollno);
    		System.out.println("Student name is : "+Studentname);
    		
    		
    	}
    	
    	else
    	{
    		
    		System.out.println("Invalid Statement");
    	}
    	
    }
    
	

}
