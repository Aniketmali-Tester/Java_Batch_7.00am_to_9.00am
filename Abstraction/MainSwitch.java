package Abstraction;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Switch s;
		   
		   s=new Tv();
		   s.Switchon();
		   s.Switchoff();
		   
		   
		   
		   System.out.println("********************************************");
		  
		   s=new Ac();
		   s.Switchon();
		   s.Switchoff();
	}

}
