package Interface;

public class Indigo implements FlightServiceprovider {

	@Override
	public void getservicename() {
		System.out.println("Welcome to Indigo Service provider");
		
	}

	@Override
	public void bookticket(int qty) {
		int ticketprice = 3000;
		int totalprice = ticketprice*qty;
		
		System.out.println("Total Ticket price : "+totalprice);
		
	}
	
	

}
