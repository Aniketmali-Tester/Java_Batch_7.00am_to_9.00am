package AccessModifier;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*DefaultMembers obj=new DefaultMembers();
		System.out.println(obj.name);
		System.out.println(obj.empid);
		System.out.println(obj.des);
		
		obj.display();*/
		
		
		
		ProtectorMembers obj=new ProtectorMembers();
		System.out.println(obj.name);
		System.out.println(obj.empid);
		System.out.println(obj.des);
		
		obj.display();
		
	

	}

}
