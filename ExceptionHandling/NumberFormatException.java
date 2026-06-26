package ExceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		String s="12abc";
		
		try
		{
			int no = Integer.parseInt(s);
		
		    System.out.println(no);
		
		}catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		
		
		System.out.println("program Ended");
		

	}

}
