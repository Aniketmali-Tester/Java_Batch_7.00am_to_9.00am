package Abstractionclass;

public class EngineeringStudent extends Student{

	@Override
	void calculateScholarship() {
		// TODO Auto-generated method stub
		
		if(marks>85)
		{
			
			System.out.println("You have 20,000 scholarship");
		}
		else
		{
			System.out.println("NO Scholarship");
		}
		
	}

}
