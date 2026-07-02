package SetInterface;

import java.util.Scanner;

public class Mainproductclass {

	public static void main(String[] args) {
		
		Shoopingcart obj=new Shoopingcart();
		Scanner scan=new Scanner(System.in);
		boolean status=true;
		int choice=0;
		obj.addporduct();
		
		while(status)
		{
			System.out.println("Select Mode Of Opertation");
			System.out.println("1.Show Product");
			System.out.println("2.Add to cart");
			System.out.println("3.View Cart items");
			System.out.println("4.Remove cart Items");
			System.out.println("5.Exit");
			
			choice=scan.nextInt();
			
			status=false;
		}
		
		
		switch(choice)
		{
		
		case 1:
			obj.showproduct();
		    break;
		    
		    case 2:
		    	System.out.println("Enter A product");
		    String name = scan.next();
		    obj.Addtocart(name);
		    break;
		    
		    
		    case 3:
		    	obj.viewcart();
		        break;
		        
		        case 4:
		        	System.out.println("Enter a product name");
		        String removeproduct = scan.next();
		        obj.removecartitems(removeproduct);
		        
		        
		        default:
		        	status=false;
		    
			
		}
		
		
		

	}

}
