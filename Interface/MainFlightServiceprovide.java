package Interface;

public class MainFlightServiceprovide {

	public static void main(String[] args) {
		 
		FlightServiceprovider obj;
		
		
		/*obj=new AirIndia();
		obj.getservicename();
		obj.bookticket(5);*/
		
		obj=new Indigo();
		obj.getservicename();
		obj.bookticket(5);

	}

}
