package ExceptionHandling;

public class ThrowsException2 {
	
	
	
	
	public static void register(int age,int sal) throws Exception
	{
		
		
		if(age<18)
		{
			
			throw new Exception("Employee age is not valid");
		}
		else if(sal<10000)
		{
			
			throw new Exception("Salary must be at least 10000");
		}
		
		System.out.println("Employee Register Succefully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			register(19, 8000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Register Complete Succefully");
		}
	
		
		
		

	}

}
