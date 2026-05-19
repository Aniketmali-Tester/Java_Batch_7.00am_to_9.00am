package VariableTypes;

public class Variable {
	
	
	
	//Class variables
	
	   static   String name="John";
	   static   String des="QA";
	    static  String company="V-Accel";
	     static int empid=1567;
	     static double sal=55000.0;
	      static String dob="14-08-1998";
	      
	      
	 //Instance variables
	      
	      String Bikemodel="FZ";
	      String Bikecompany="Yamaha";
	      String Bikecolour="grey";
	      int mileage=50;
	      double price=180000;
	      
	      
	   //Local variable
	      
	      
	      
	      
	      void bikedetailsdispaly()
	      {
	    	  System.out.println("The bike model is : "+Bikemodel);
	    	  System.out.println("The bike company  is : "+Bikecompany);
	    	  System.out.println("The bike colour  is : "+Bikecolour);
	    	  System.out.println("The bike mileage is : "+mileage);
	    	  //System.out.println("The bike price is : "+price);
	    	  
	    	  
	      }

	      
	      static void persondetails()
	      {
	    	  System.out.println("The Emp name is   : "+name);
	    	  System.out.println("The designation  is : "+des);
	    	  System.out.println("The Company  is : "+company);
	    	  System.out.println("The emp id is : "+empid);
	    	  System.out.println("The emp sal is : "+sal);
	    	  System.out.println("The dob : "+dob);
	    	
	    	  
	    	  
	      }
	      
	      
	      String Bankname;
	      String Branch;
	      
	      void accountdetails1(long accountno,String name,String Accountype,double openingamount)
	      {
	    	        Bankname="SBI";
	    	       Branch="Chennai";
	    	      
                                                                	    	      
	    	     System.out.println("Welcome to ouy Our" + Bankname + " "+"Bank");
	    	     
	    	     System.out.println("Welocome our "+ Branch+ " " +"Branch");
	    	  
	    	  System.out.println("The Account number is :"+accountno);
	    	  System.out.println("The Accountholder name  is :"+name);
	    	  System.out.println("The Account type  is : "+Accountype);
	    	  System.out.println("The Account opening amount  is :"+openingamount);
	    	  
	    	  
	    	  System.out.println("Account1 Created succefully ");
	    	  
	    	  System.out.println("===========================================");
	    	  
	      }
	      
	    
	      
	      
	      
	      
	      void accountdetails2(long accountno,String name,String Accountype,double openingamount)
	      {
	    	      
	    	      
                                                                	    	      
	    	     System.out.println("Welcome to ouy Our" + Bankname + " "+"Bank");
	    	     
	    	     System.out.println("Welocome our "+ Branch+ " " +"Branch");
	    	  
	    	  System.out.println("The Account number is :"+accountno);
	    	  System.out.println("The Accountholder name  is :"+name);
	    	  System.out.println("The Account type  is : "+Accountype);
	    	  System.out.println("The Account opening amount  is :"+openingamount);
	    	  
	    	  
	    	  System.out.println("Account2 Created succefully ");
	    	  
	    	  
	    	  
	      }
	      
	      
	      
	      public static void main (String [] args) {
	    	  
	    	  //persondetails();
	    	  //System.out.println(name);
	    	  
	    	  Variable v=new Variable();
	    	 // v.bikedetailsdispaly();
	    	  
	    	 // System.out.println(v.price);
	    	  
	    	  
	  // void accountdetails2(long accountno,String name,String Accountype,double openingamount,String bank,String branch)
	    	v.accountdetails1(1234567, "john", "Saving",  5000);
	    	v.accountdetails2(1234555567, "Babu", "current",  60000);
	    	
	    	  
	    	  
	    	  
	    	  
	      }
}

	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
				

