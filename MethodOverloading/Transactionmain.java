package MethodOverloading;

import java.util.Scanner;

public class Transactionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		Transaction obj=new Transaction();
		
		
		
		System.out.println("Please select mode of payment");
		System.out.println("1.card payment \t 2.upipayment");
		int choice=scan.nextInt();
		
		
		
		if(choice==1)
		{
			
			System.out.println("Enter a cardno");
			int cardno=scan.nextInt();
			System.out.println("Enter a cvv no");
			int Cvvno=scan.nextInt();
			System.out.println("Enter a amount");
			double amount=scan.nextDouble();
			obj.makepayment(cardno, Cvvno, amount);
			
		}
		else if(choice==2)
		{
			
			
			System.out.println("Provide a upipin");
			int upi = scan.nextInt();
			System.out.println("Enter a amount");
			double amount=scan.nextDouble();
			obj.makepayment(amount, upi);
		}
		
		else
		{
			
			System.out.println("Invalid Selection");
		}

	}

}
