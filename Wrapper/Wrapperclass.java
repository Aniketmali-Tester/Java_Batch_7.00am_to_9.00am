package Wrapper;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		String s="Java";
		String s1=new String("java");
		
		String s2="10";
		String s3="20";
		System.out.println("Before Parse : "+s2 +" "+s3);
		/*int a=10;
		int a1=new int(20);*/
		
		//double d1=new double(20.5);
		
		//Wrapper
		Integer b=new Integer(10);
		
		Double d=new Double(20.5);
		
		int s4 = Integer.parseInt(s2);
		int s5 = Integer.parseInt(s3);
		
		
		
		
		//convert string into int
		  // System.out.println("After Parse :"+(s4+s5));
		   
		   
		   //convert String into double
		   String d1="30.5";
		   String d2="30.4";
		   
		   System.out.println("Before parse double value : "+(d1+d2));
		   
		   
		   double d3 = Double.parseDouble(d1);
		   double d4 = Double.parseDouble(d2);
		   
		   System.out.println("After parse double value : "+(d3+d4));
		   
		   
		  
		   
		  // System.out.println("Before Parse Double value : "+d1);
		   
		  //System.out.println( Float.parseFloat(d1));
		  
		  
		  //convert String into boolean
		  
		  /*String b1="true";
		  
		  System.out.println(Boolean.parseBoolean(b1));*/
		   
		   
		   //Convert String into Char
		   String c="Java";
		   
		   //Convert double into String
		
		   String d5 = String.valueOf(d3);
		   String d6 = String.valueOf(d4);   
		   System.out.println(d5+d6);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
	}

}
