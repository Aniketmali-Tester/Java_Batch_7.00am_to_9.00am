package Encapsulation;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human obj=new Human();
		
		 System.out.println("Before Set value ");
		 System.out.println(obj.getname()); 
    	 System.out.println(obj.getaccountno()); 
    	 System.out.println(obj.getdob()); 
    	 
    	 
    	 System.out.println("======================================");
    	 
    	 System.out.println("After Set value or updated values");
    	 obj.Setname("Akash");
    	 obj.SetDob("01-01-2000");
    	 System.out.println(obj.getname()); 
    	 System.out.println(obj.getaccountno()); 
    	 System.out.println(obj.getdob()); 
    	 
    	 
    	 
    	 
    	 

	}

}
