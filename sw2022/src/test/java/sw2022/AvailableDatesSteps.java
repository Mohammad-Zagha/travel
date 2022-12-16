package sw2022;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AvailableDatesSteps {
    private static final String DATE_FORMAT = "dd-MM-yyyy";
    private static final Map<String, String> AVAILABLE_DATES = new HashMap<>();
    static {
        AVAILABLE_DATES.put("24-11-2017", "Palestine");
        AVAILABLE_DATES.put("25-11-2017", "Maldive");
        AVAILABLE_DATES.put("26-11-2017", "Chicago");
        AVAILABLE_DATES.put("28-11-2017", "Istanbul");
    }

    private String date;
    private String flight;

    @Given("that user enter the date of journey in dd-mm-yyyy format")
    public void user_enter_date_in_dd_mm_yyyy_format() {
        // Set the date in the dd-mm-yyyy format
        this.date = "24-11-2017";
    }

    @Given("the date is in the available dates table")
    public void date_is_in_available_dates_table() {
        // Check if the date is in the available dates table
        if (AVAILABLE_DATES.containsKey(this.date)) {
            // Set the flight for the date
            this.flight = AVAILABLE_DATES.get(this.date);
        }
    }
	@Given("user is loged in to the system")
	public void user_is_loged_in_to_the_system() {
	    // Write code here that turns the phrase above into concrete action
	}

	@When("user enters the date")
	public void user_enters_the_date() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("the flight with the date will appear")
	public void the_flight_with_the_date_will_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("that user enter the date of journey in different date format :")
	public void that_user_enter_the_date_of_journey_in_different_date_format() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("error messege {string}")
	public void error_messege(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
