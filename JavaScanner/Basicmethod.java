package JavaScanner;

public class Basicmethod {
	
	
	//Internal Method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Main method start");
		
		
		//add calculation
		int a=10;
		int b=20;
		//int c=a+b;
		System.out.println("The additional value is  :"+(a+b));//30
		
		
		
		//Subraction calculation

		int e=10;
		int f=50;
		
		System.out.println("The Subraction value  : "+(e-f));
		
		add();
		sub();
		
		System.out.println("Main Method end");
		
		
		

	}
	
	
	//External Method 1+non parameterized method
	
	public static void add()
	{
		
		int c=20;
		int d=40;
		
		System.out.println("The additonal value of external method 1  :"+(c+d));//60
	}
	
	//External Method 2+non-parameterized method
	public static void sub()
	{
		
		int e=10;
		int f=50;
		
		System.out.println("The Subraction value in external method 2 : "+(e-f));//40
	}
	
	
	
	
	
	
	
	
	

}
