package AccessModifier;

public class PrivateMembers {
	

	//Data Members
	 private String name="Navin";
	private  int empid=101;
	private String des="Tester";
	
	//function members
	private void display()
	{
		System.out.println("private Acsess method");
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PrivateMembers obj=new PrivateMembers();
		obj.display();
		System.out.println(obj.name);
		System.out.println(obj.empid);
		System.out.println(obj.des);
		
		
		

	}

}
