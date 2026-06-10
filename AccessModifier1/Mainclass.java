package AccessModifier1;

import AccessModifier.ProtectorMembers;

public class Mainclass extends ProtectorMembers {

	public static void main(String[] args) {
		
		Mainclass obj=new Mainclass();
		System.out.println(obj.name);
		System.out.println(obj.empid);
		System.out.println(obj.des);
		
		obj.display();
		
		
		
		

	}

}
