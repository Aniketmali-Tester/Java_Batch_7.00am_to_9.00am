package Switchcase;

import java.util.Scanner;

public class SwitchProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*>Following Syntax for Switch Case:-
        
        switch(Expression)
             {
                   case1:
                          -----
                          -----
                          -----
                          break;
               
                    case2:
                           
                            ----
                            ----
                            ----
                            break;
                      
                      default:
              
              }*/
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a city \n 1.Chennai \n 2.Coimbatore \n 3.Bengaluru \n 4.Mumbai");
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			   
			System.out.println("Welcome to chennai");
			break;
			
		case 2:
			 System.out.println("Welcome to coimbatore");
			 break;
			 
		case 3:
			  System.out.println("Welcome to Bengaluru");
			  break;
			  
		case 4:
			  System.out.println("Welcome to mumubai");
			  break;
			  
		default :
			    
			   System.out.println( "Invalid City");
		
		
		
		
		}
		

	}

}
