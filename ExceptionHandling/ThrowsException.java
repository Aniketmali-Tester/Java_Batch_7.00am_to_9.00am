package ExceptionHandling;

public class ThrowsException {
	
	
	
	
	public static void checkage(int age) throws Exception
	{
		
		
		if(age<18)
		{
			
			throw new Exception("Not Eligible");
		}
		else
		{
			
			throw new Exception("Eligible");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			checkage(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("program Ended");
		
		

	}

}
