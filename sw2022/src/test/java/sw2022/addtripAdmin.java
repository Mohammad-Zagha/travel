package sw2022;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw2022.Trip;
import sw2022.admin;

public class addtripAdmin {
admin Admin;
Trip trip;
	public addtripAdmin(Trip trip) {
		this.trip = trip;
		Admin = new admin("mohammad", "zagha");
	}
	@Given("that the Admin is logged in")
	public void that_the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    Admin.login("zagha");
	}

	@Given("there is a trip with country {string}, airport {string}, and id_trip {string}")
	public void there_is_a_trip_with_country_airport_and_id_trip(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    trip.set("Maldive", "Malta", "C20");
	}

	@When("the trip is added to the trip website")
	public void the_trip_is_added_to_the_trip_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	trip.add(Admin);
	}

	
	@Then("the trip with  country {string}, airport {string}, and id_trip {string}  added to trip website")
	public void the_trip_with_country_airport_and_id_trip_added_to_trip_website(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions

		assertEquals( trip.isAdded(), true );
	  //  throw new io.cucumber.java.PendingException();
	}




	@Given("that the Admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		Admin.logout();
	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Admin.logout();
		trip.set("DC","Washington","C33");
		assertEquals(trip.add(Admin), false);
		System.out.println("please login to ensure you are Admin");
	}

}
