package Object;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String name="Samsung M51";
		String processor="730G Sanpdargon";
		int ram=8;
		String colour="Black";
		double price=22500;
		
		
		//Object create for samsung mobile
		Mobile m=new Mobile();
		m.mobilename();
		m.price();
		m.processor();
		m.ram();
		
		
		//Object create for Apple mobile	
	Mobile m1=new Mobile();
	m1.mobilename1();
	m1.price1();
	m1.processor1();
	m1.ram1();
	
	//Object create for Vivo mobile
	Mobile m2=new Mobile();
	m2.mobilename2();
	m2.price2();
	m2.processor2();
	m2.ram2();
		
		
		

	}
	
	void mobilename()
	{
		
		System.out.println("The Mobile name is Samasung");
	}
	
	void processor()
	{
		
		System.out.println("The Processor is Snapdargon");
	}
	
	void price()
	{
		
		System.out.println("The price is 25000");
	}
	
	void ram()
	{
		
		System.out.println("The Mobile name is 8gb");
		
		
		System.out.println("===========================================");
	}
	
	
	void mobilename1()
	{
		
		System.out.println("The Mobile name is Apple");
	}
	
	void processor1()
	{
		
		System.out.println("The Processor is Safari");
	}
	
	void price1()
	{
		
		System.out.println("The price is 60000");
	}
	
	void ram1()
	{
		
		System.out.println("The Mobile name is 8gb");
		
		
		
		
		System.out.println("===========================================");
	}
	
	
	
	
	void mobilename2()
	{
		
		System.out.println("The Mobile name is vivo");
	}
	
	void processor2()
	{
		
		System.out.println("The Processor is Mediatek");
	}
	
	void price2()
	{
		
		System.out.println("The price is 30000");
	}
	
	void ram2()
	{
		
		System.out.println("The Mobile name is 16gb");
	}
	
	

}
