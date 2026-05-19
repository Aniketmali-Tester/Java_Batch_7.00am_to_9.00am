package Switchcase;

import java.util.Scanner;

public class SwitchProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a java program using switch case for a mobile recharge.
		 * Accept a recharge plan from the user.
		 * Display the recharge benefits based on the plan.
		 * 199---1 gb/day and Unlimited call and 100 sms.
		 * 299---2 gb/day and Unlimited call and 200 sms.
		 * 399---3 gb/day and Unlimited call and 300 sms.
		 * If user Enters a invalid recharge Plan means Display "Invalid Recharge plan"
		 */
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Select a type of plan  \n 1.199  \n 2.299  \n 3.399");
		
		
		//* Accept a recharge plan from the user.
		int plan = Sc.nextInt();
		
		
		/*Display the recharge benefits based on the plan.
		 * 199---1 gb/day and Unlimited call and 100 sms.
		 * 299---2 gb/day and Unlimited call and 200 sms.
		 * 399---3 gb/day and Unlimited call and 300 sms.*/
		
		
		switch (plan) {
		
		
		case 1:
			    System.out.println("Your plan have 1.1gb/day  && \n2.unlimited calls && \n3.100 sms ");
			    break;
			    
		case 2:
		    System.out.println("Your plan have 1.2gb/day && \n2.unlimited calls && \n3.200 sms ");
		    break;
		    
		case 3:
		    System.out.println("Your plan have 1.3gb/day && \n2.unlimited calls && \n3.300 sms ");
		    break;
		    
		    
		    default:
		    	System.out.println("Invalid plan option");
		    
			    
	}
		}

}
