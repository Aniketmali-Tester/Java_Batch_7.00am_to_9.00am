package Interface;

public class AirIndia implements FlightServiceprovider
{

	@Override
	public void getservicename() {
		System.out.println("Welcome to AirIndia Service Provider");
		
	}

	@Override
	public void bookticket(int qty) {
		
		 double price=2500;
		 double totalprice = price*qty;
		 System.out.println("Total Ticket price : "+totalprice);
		
	}

}
