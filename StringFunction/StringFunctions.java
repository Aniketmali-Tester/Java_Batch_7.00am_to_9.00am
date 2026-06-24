package StringFunction;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Without using new Operator
		String Str1="JAVA";
		String Str2="SQl";
		String Str3="JAVA";
		
		//With using New Operator
		String s1=new String("J2EE");
		String s2=new String("J2EE");
		String s3=new String("JAVA");
		String s4=new String("SQL");
		
		
		System.out.println(Str1==Str2);//false
		System.out.println(Str1==Str3);//true
		System.out.println(s1==s2);//false
		System.out.println(Str1.equals(s3));//true
		System.out.println(Str2.equals(s4));//false
		System.out.println(Str2.equalsIgnoreCase(s4));//true
		
		
		
		   String name="jhnasi rahima";
		   
		   System.out.println("The  person name :  "+name);//the person name : jhansi
		                                                   //the person name : rahima
		 String name1 [] =name.split(" ");
		   
		   
		   
		   for(int i=0;i<name.length();i++)
		   {
			   
			   System.out.println("The  person name :  "+name1[i]);
		   }
		   
		   
		   
		
		String str="    Java Programming language";
		String str2="     JAVA PROGRAMMING          ";
		
	     System.out.println("String Length is : "+str.length());//16
	     
	     System.out.println("Character :"+str.charAt(3));//a
	     
	     System.out.println("Indexof character : "+str.indexOf( " "));//4
	     
	     System.out.println("LastIndex of character is : "+str.lastIndexOf('a'));//
	     
	     System.out.println("contains char value in string : "+str.contains("P"));//p
	     
	     System.out.println("start with : "+str.startsWith("J"));//true
	     
	     System.out.println("Start with : "+str.startsWith("Programming" ));//false
	    
	     
	     System.out.println("Start with : "+str.endsWith("Programming" ));//True
	     
	     
	     System.out.println("Substring Starting index :  "+str.substring(3));
	     System.out.println("Substring start with ending index : "+str.substring(10,15));
	     
         System.out.println("uppercase : "+str.toUpperCase());//JAVA PROGRAMMING"
	     
	     System.out.println("Lowercase : "+str2.toLowerCase());//"Java Programming";
	     
	     //System.out.println("Split Function : "+str.split(" "));
	     
        // String split[]= str.split(" ");
         
         //System.out.println("splif function : "+split[1]);
        // System.out.println("Split function : "+split);
         
        /* for(int i=0;i<split.length;i++)
         {
        	 
        	 System.out.println(split[i]);
         }*/
         
         System.out.println("isEmpty Function : "+str.isEmpty());
         
       System.out.println("Before isreplace : "+str.replace("J", "p"));
       
       System.out.println("istrim function  :"+str.trim( ));
       
       System.out.println("is trim function : "+str2.trim());
       
       
       
       
       
      
         
         
	     
	     
	     

	}

}
