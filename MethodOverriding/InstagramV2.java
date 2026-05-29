package MethodOverriding;

public class InstagramV2 extends Instagram{

	
	
	int Followers;
	  
	@Override
	public void Features() {
		// TODO Auto-generated method stub
	    
		Followers +=1000;

	  	
	  		System.out.println("Instagram Version V2 Updated");
	  		System.out.println("Story Feature Added");
	  		System.out.println("Increases Followers count " +Followers);
	  		
	  		
	  	}
	}
	
	
	


