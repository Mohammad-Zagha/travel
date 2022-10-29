package sw2022;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw2022.Trip;
import sw2022.Admin;


public class jointrip {
	User user=new User ("amer" ,"zagha");
	Trip trips;
	ArrayList<Trip> UsertripsList=new ArrayList<>();
	@Given("that the User is logged in")
	public void that_the_user_is_logged_in() {
	   user.login("amer" ,"zagha");
	    
	}

	@Given("choose a trip with country {string} , airport {string} , and TripCource {string}")
	public void choose_a_trip_with_country_airport_and_trip_cource(String string, String string2, String string3) {
		trips=new Trip("spain","qatar","some Cource");
	}

	@When("the trip is added to the UsertripList")
	public void the_trip_is_added_to_the_usertrip_list() {
	   

		if((Controlls.jointrip(user, trips,UsertripsList)))
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
		
	    
	}
	



}
