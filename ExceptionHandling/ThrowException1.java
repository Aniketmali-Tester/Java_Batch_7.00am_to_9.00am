package ExceptionHandling;

public class ThrowException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//Customer Wants to withdraw money from an ATM.
		//If the withdraw amount is grater available balance,throw Exception
		
		int balanceamount=7000;
		int withrawamount=7000;
		
		
		try {
		if(withrawamount>balanceamount)
		{
			//Explicit Exception
			throw new Exception("Balance Range amount is low");
		}
		else
		{
			
		balanceamount=balanceamount-withrawamount;
		System.out.println("Withdraw Succesfull");
		System.out.println("Remaining balance : "+balanceamount);
		}
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}finally 
		{
			
			System.out.println("Thank you ");
		}
		
		
		
		
	}

}
