package Abstractionclass;

public class MBAStudent extends Student {

	@Override
	void calculateScholarship() {
		// TODO Auto-generated method stub
		
		if(marks>80)
		{
			
			System.out.println("You have 15,000 scholarship");
		}
		else
		{
			
			System.out.println("No Scholarship");
		}
		
	}

}
