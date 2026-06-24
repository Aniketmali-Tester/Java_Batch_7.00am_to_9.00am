package Interface;

public class MainInsuranceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Insurancepolicy obj;
		
		
		obj=new HealthInsurance();//upcasting
		obj.calculatePremium();
		
		
		obj=new LifeInsurance();//upcasting
		obj.calculatePremium();
		
	     obj=new VechileInsurance();//upcasting
		obj.calculatePremium();
		
		
		
		

	}

}
