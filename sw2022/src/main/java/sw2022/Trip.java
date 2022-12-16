package sw2022;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import io.cucumber.java.it.Date;

public class Trip  {
	String destination;
	String airportNOW;
	String tripID;
	boolean registered;
	LocalDate registeringDate;
	
	
//	String datew;
//	String daytt;
//	String namet;
	
	public Trip() {
		
	}
	public Trip(String d,String a,String I) {
		destination=d;
		airportNOW=a;
		tripID=I;
		registered =false;
	    registeringDate=LocalDate.now();
	}
//	public void Tripdate(String d,String dayt,String n) {
//		datew=d;
//		daytt=dayt;
//		namet=n;
//	}
	
}

