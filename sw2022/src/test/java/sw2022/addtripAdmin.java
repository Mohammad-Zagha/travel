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

public class addtripAdmin {

Admin admin=new Admin("admin");
 Trip trip1;
ArrayList<Trip> tripsList=new ArrayList<>();
	@Given("that the Admin is logged in")
	public void that_the_admin_is_logged_in() {
		admin.login("admin");
	}
	@Given("there is a trip with country {string} , airport {string} , and TripCource {string}")
	public void there_is_a_trip_with_country_airport_and_trip_cource(String string, String string2, String string3) {
		
		trip1=new Trip("Maldive","Malta","some Cource");
	}
	
	@When("the trip is added to the tripList")
	public void the_trip_is_added_to_the_trip_list() {
		
		if((Controlls.addTrip(admin, trip1,tripsList)))
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
		
	}
	@Then("the trip with  country {string} , airport {string} , and and TripCource {string} should show up")
	public void the_trip_with_country_airport_and_and_trip_cource_should_show_up(String string, String string2, String string3) {
		System.out.print(tripsList.get(0).tripName+"/"+tripsList.get(0).airport+"/"+tripsList.get(0).tripCource);
	}



		
	}











