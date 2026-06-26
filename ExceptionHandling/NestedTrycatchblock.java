package ExceptionHandling;

public class NestedTrycatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("program Started");
		
		int a=10;
		int b=0;
		
		String s=null;
		
	try {
		 try
		 {
			
		int c=a/b;
		System.out.println("c "+c);
		
		
		
		}catch(ArithmeticException e)
		 {
			
			System.out.println(e);
		 }
		 System.out.println(s.length());
			
	}catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
		
		System.out.println("program Ended");
		
		
		
	}

}
