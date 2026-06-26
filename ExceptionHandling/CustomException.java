package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
	
	
	
	
	public static void getbill(int qty,double price) throws InvalidPriceException
	{
		if(price>0)
		{
			double total =qty*price;
			System.out.println(total);
		}
		else
		{
			
			
			throw new InvalidPriceException("Price Must be positive");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Qunty");
		int qty = scan.nextInt();
		
		System.out.println("Enter A price");
		double price = scan.nextDouble();
		
		getbill(qty, price);
		
		

	}

}
