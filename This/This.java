package This;

public class This {
	
	
	
	 String Bagname;
	 String Bagcolour;
	String Bagmodel;
    double Bagprice;
	int Bagwarranty;
	
	
public void Bagdetails(String Bagname,String Bagcolour,String Bagmodel,double Bagprice,int Bagwarranty)
	{
		
	this.Bagname=Bagname;
	this.Bagcolour=Bagcolour;
	this.Bagmodel=Bagmodel;
	this.Bagprice=Bagprice;
	this.Bagwarranty=Bagwarranty;

	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		This t=new This();
		t.Bagdetails("Roshan", "Black", "2026", 1500, 2);
		
		System.out.println("Bagname is :"+t.Bagname);
		System.out.println("Bagcolour is :"+t.Bagcolour);
		System.out.println("Bagmodel is :"+t.Bagmodel);
		System.out.println("Bagprice is :"+t.Bagprice);
		System.out.println("Bagwarranty is :"+t.Bagwarranty);
		

	}

}
