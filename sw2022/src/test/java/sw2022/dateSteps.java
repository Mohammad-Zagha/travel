package sw2022;

import java.io.File;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dateSteps {
String date="",temppath="";
Scanner s=new Scanner(System.in);
String path="flights/";

	public dateSteps() {
		// TODO Auto-generated constructor stub
	}
	
	@Given("that user enter the date of journey in dd-mm-yyyy format :")
	public void that_user_enter_the_date_of_journey_in_dd_mm_yyyy_format() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		 boolean B=false;
		    while(B==false)
		    {
		     date=s.next();
		     temppath=path+date;
		     File f2=new File(temppath);
		     B=f2.isDirectory();
		     if(B!=true)
		       System.err.printf("choose a date from the available dates in (dd-mm-yyyy) format : ");
		     break;
		    }
	}

	@Given("user is loged in to the system")
	public void user_is_loged_in_to_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
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
