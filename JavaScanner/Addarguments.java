package JavaScanner;

public class Addarguments {
  
	
	//Internal method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method Start");
		
		add(10, 20);
		sub(40, 20);
		
		
		
		System.out.println("Main Method End");

	}
	
	//External Method1+Parameterized method
	
	public static void add(int value1,int value2)
	{
		
		
		System.out.println("The External add method value1 is :"+(value1+value2));
	}
	//Externl Method2+parametermized method
	public static void sub(int value1,int value2)
	{
		System.out.println("The External add method value1 is :"+(value1-value2));
	}

}
