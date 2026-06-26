package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException1 {

	public static void main(String[] args) {
		
		
		System.out.println("Program Started");
		
		Scanner scan=new Scanner(System.in);
		
		try
		{System.out.println("Enter First Number");
		
		
		  int no1 = scan.nextInt();
		  
		  System.out.println("Enter Second Number");
		  int no2 = scan.nextInt();
		  
		  int result = no1/no2;
		  
		  System.out.println("Result"+result);
		  
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch (Exception i)
		{
			System.out.println(i);
		}
		
		  
		  System.out.println("Program Ended");

	}

}
