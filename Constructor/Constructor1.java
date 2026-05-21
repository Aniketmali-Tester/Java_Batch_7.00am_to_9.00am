package Constructor;

public class Constructor1 {
	
	
	//Declare Constructor
	
	
	/*Constructor1()
	{
	
		System.out.println("Non-parameterized or Default constructor");
		
		String name="Arun";
		double sal=30000;
		
		System.out.println("The Name is : "+name);
		System.out.println("Sal is : "+sal);
		
	}*/
	
	
	


	Constructor1(String name,int sal)
	{
		
		System.out.println("parameterized or user defined  constructor");
		System.out.println("The Name is : "+name);
		System.out.println("Sal is : "+sal);
	}
	
	

	


	Constructor1(int sal,String name)
	{
		
		System.out.println("parameterized or user defined  constructor");
		System.out.println("The Name is : "+name);
		System.out.println("Sal is : "+sal);
	}
	
	public void info()
	{
		
		System.out.println("I'm a normal method");
	}

	public static void main(String[] args) {
		
		
		Constructor1 c=new Constructor1("Arun",30000);
		c.info();
		System.out.println("=================================================");
		
		Constructor1 c1=new Constructor1(35000,"Deepak");
		System.out.println("=================================================");
		
		Constructor1 c2=new Constructor1();
		System.out.println("=================================================");
		
		Constructor1 c3=new Constructor1();
		System.out.println("=================================================");
		
		
		Constructor1 c4=new Constructor1();
		System.out.println("=================================================");
		
		
		

	}

}
