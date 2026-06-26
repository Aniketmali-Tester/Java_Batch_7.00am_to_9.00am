package ExceptionHandling;

import java.util.Scanner;

public class ThrowException {
	
	
	
	
	
	public static void calculatesalary(double basic,double Incev)
	{
		
		
		if(basic>0 && Incev>0)
		{
			double total = basic+Incev;
			System.out.println("total salary : "+total);
			
		}
		else
		{
			
			//explicit exception
		      throw new ArithmeticException("Invalid Salary");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double basic = scan.nextDouble();
		System.out.println("Enter Incentives");
		double Incev = scan.nextDouble();
		calculatesalary(basic, Incev);
		
		

	}

}
