package ConstructorChaining;


//Sub class1 or child class 1 Constructor 
public class College extends University {
	
	
	College(String University,String college)
	
	{
		super(University);
		System.out.println("=================================");
		System.out.println("subclas 01 constructor");
		System.out.println("College name is : "+college);
		
	}

}
