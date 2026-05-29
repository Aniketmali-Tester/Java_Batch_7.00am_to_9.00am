package MethodOverriding;


//sub class or child class
public class InstagramV4 extends InstagramV3 {
	
	int Followers;
	@Override
	public void Features()
	{
		
		
		Followers +=5000;
		System.out.println("Instgram V4 Updated");
		System.out.println("Boardcast  channel feature added");
		System.out.println("Followers Count : "+Followers);
		
		if(Followers>=1000)
		{
			
			System.out.println("Blue Tick Eligible");
		}
		
		
	}

}
