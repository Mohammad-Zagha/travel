package software;
import java.time.LocalDate;


public class Trip  {
	String destination;
	String airportNOW;
	String tripID;
	boolean registered;
	LocalDate registeringDate;
	

	  
	public Trip() {
		
	}
	public Trip(String d,String a,String IdFortrip) {
		destination=d;
		airportNOW=a;
		tripID=IdFortrip;
		registered =false;
	    registeringDate=LocalDate.now();
	}
	
}

