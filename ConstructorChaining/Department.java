package ConstructorChaining;


//Sub  claa 2 or child class 02 Constructor
public class Department extends College{
	
	
         Department(String University,String College,String Department) {
		
        	 
        	   super(University, College);
        	   System.out.println("====================================");
        	   System.out.println("Sub class 02 constructor");
        	   System.out.println("Departmnet name is"+Department );
	}

}
