package MethodOverriding;


//sub class or child class
public class InstagramV3 extends InstagramV2 {

	
	int Followers;
	@Override
	public void  Features()
	{
		
		 Followers+=5000;
		 System.out.println("Instagram V3 updated");
		 System.out.println("Followers Count : "+Followers);
		 
		 
		 
		 if(Followers>=3000)
		 {
			 
			 System.out.println("Monetization Features Enables");
		 }
			 
		 
		 
	}
}
