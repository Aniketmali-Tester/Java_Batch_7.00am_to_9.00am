package Encapsulation;

public class Human {
	
	
	
	//Data Members
	 private  String name="Arun";
	 private  long  accountno=23468989594003L;
	 private String DOB="14.08.1998";
	 
	 
	 
	 
	 //getter method
	 public String getname()
	 {
		 
		 
		 return name;
	 }
	 
	 public long getaccountno()
	 {
		 
		 return accountno;
	 }
	 
	 public String getdob()
	 {
		 
		 return DOB;
	 }
	
	 
	 
	 //setter method
	 
	 
	 public void Setname(String name)
	 
	 {
		 
		this. name=name;
	 }
	 
	 public void SetDob(String DOB)
	 {
		 
		this. DOB=DOB;
	 }
	
	void display()
	{
		
		System.out.println(name);
		System.out.println(accountno);
	}
	
	
     public static void main(String [] args)
     {
    	 
    	  Human obj=new Human();
    	 System.out.println(obj.name); 
    	 System.out.println(obj.accountno); 
    	 System.out.println(obj.DOB); 
    	 
    	 
    	 obj.display();
    	  
    	 
     }
	

}
