package MethodOverloading;

public class Transaction {
	
	
	int cardno=2345678;
	int cvvno=678;
	int upipin=4587;
	
	
	//method overload & //Card payment
	void makepayment(int Cardno,int Cvv,double amount)
	{
		
		
		if(Cardno==cardno && Cvv==cvvno)
		{
			
			System.out.println("Order Succefully ");
			System.out.println("Payment Recieved through card : "+amount);
		}
		else
		{
			
			System.out.println("Invalid selection");
		}
		
	}
	
	    //method overload & // UPI payment
		void makepayment(double amount,int upipin)
		{
			
			
			if(upipin==upipin)
				
			{
				
				System.out.println("Order succefully");
				System.out.println("payment done through Upi : "+amount);
						
				
			}
			
			else
			{
				
				System.out.println("Invalid Selection");
			}
		


	
	

	}

}
