package MethodOverloading;

import java.util.Scanner;

public class StudentMainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		Student s=new Student();
		
		
		System.out.println("Please select a search criteria");
		System.out.println("1.search by name  \t 2.search by Rollno");
		int choice = scan.nextInt();
		
		
		if(choice==1)
		{
			
			System.out.println("Enter a name");
			String name = scan.next();
			s.Searchstudent(name);
			
		}
		
		
		else if(choice==2)
		{
			
			System.out.println("Provide a roll no");
			long rollno = scan.nextLong();
		    s.Searchstudent(rollno);
		}
		else
		{
			
			System.out.println("Invlaid choice");
		}
		
		
		
		
		
		
		

	}

}
