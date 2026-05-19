package HierarchicalInheritance;

public class ProductMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Laptop lp=new Laptop();
		lp.laptopinfo("Hp");
		lp.sellproduct(5, 50000);
		
		System.out.println("==============================================");

		
		Mobile m=new Mobile();
		m.mobileinfo("Samsung");
		m.sellproduct(5, 25000);
		
		System.out.println("==============================================");
		
		
		Ac a=new Ac();
		a.Acinfo("Voltas");
		a.sellproduct(5, 15000);
	}

}
