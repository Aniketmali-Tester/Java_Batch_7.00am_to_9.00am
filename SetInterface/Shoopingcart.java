package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Shoopingcart {
	
	//Product
	HashSet <String> product=new HashSet<String>();

	
	//viewCartproduct
	HashSet<String>cart=new HashSet<String>();
	
	public void addporduct()
	{
		
		product.add("Mobile");
		product.add("Laptop");
		
	}
	
	
	
	
	public void showproduct()
	{
		System.out.println("Product Name");
		System.out.println("==============================");
		
		
		for(String name:product)
		{
			System.out.println("Products : "+name);
		}
		
	}
	
	
	public void Addtocart(String productname)
	{
		
		boolean found = product.contains(productname);
		
		if(found)
		{
		   cart.add(productname);
			System.out.println("Product Added Succesfully");
			
		}
	}
	
	public void viewcart()
	{
		
		System.out.println("Product Name");
		System.out.println("==============================");
		for(String c:cart)
		{
			
			System.out.println("View Cart Product : "+c);
		}
		
	}
	
	public void removecartitems(String Productname)
	{

		boolean found = cart.contains(Productname);
		
		if(found)
		{
			cart.remove(Productname);
			System.out.println("Product Removed Succesfully");
		}
		else
		{
			
			System.out.println("First added to cart");
		}
		   
		
	}
	

}
