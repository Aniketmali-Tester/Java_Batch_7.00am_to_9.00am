package StringFunction;

public class Stringfunctions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Java Programming";
		String s2="       JAVA PROGRAMMING";
		
		
		//Length()
		System.out.println(s.length());//16
		
		//CharAt()
		System.out.println(s.charAt(3));//a
		
		//Indexof char()
		System.out.println(s.indexOf('a'));//1
		
		//lastindexofchar()
		System.out.println(s.lastIndexOf('a'));//10
		
		//contains()
		System.out.println(s.contains("J"));//true
		
		System.out.println(s.contains("Java"));//true
		
		//Startwith()
		System.out.println(s.startsWith("J"));//true
		
		//EndsWith
		System.out.println(s.endsWith("g"));//true
		
		//substring()
		System.out.println(s.substring(5));//Programming
		
		System.out.println(s.substring(5,10));//Progr
		
		
		//to uppercase()
		System.out.println(s.toUpperCase());//JAVA PROGRAMMING
		
		//to lowecase()
		System.out.println(s2.toLowerCase());//java programming
		
		char charArray []=s.toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			
			System.out.println(charArray[i]);
		}
		
		
		//split function
		
	     String[] array = s.split(",");
	     
	     for(int i=0;i<array.length;i++)
	     {
	    	 
	    	 System.out.println(array[i]);
	     }
		
		//isEMpty()
	     
	     System.out.println(s.isEmpty());//false
	     
	     
	     //istrim()
	     
	     System.out.println("Before Trim : "+s2);
	     System.out.println(" After Trim " +s2.trim());
		
        //replace()
	     System.out.println("Before Replace s value :"+s);
	     
	     System.out.println(s.replace("P", "p"));
	}

}
