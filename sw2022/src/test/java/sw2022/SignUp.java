package sw2022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {
	public Admin a;
	public User u;
	int beforeR;
	int afterR;
	String s;
	public SignUp() {
		
	}
	@Given("these usere are registered in the website")
	public void these_usere_are_registered_in_the_website(io.cucumber.datatable.DataTable dataTable) {
		String userName,password,email,phone;
		
		for(int i=0; i<3;i++) {
			   userName=dataTable.cell(i,0);
			   password=dataTable.cell(i,1);
			   email=dataTable.cell(i,2);
			   phone=dataTable.cell(i,3);
			  
			   u=new User(userName,password,email,phone);
			   Controlls.registeredUsers.add(u);
	}
		beforeR=Controlls.registeredUsers.size();
	
	}

	@Given("there is a user with username {string} , password {string} , email {string} , phoneNumber {string}")
	public void there_is_a_user_with_username_password_email_phone_number(String userName, String password, String email, String phone ) {
		u=new User(userName,password,email,phone);
		
			  
			   
			   }
		   
		   
		
	

	@When("user tries to register")
	public void user_tries_to_register() {
		//s=a.register(u);
		afterR=Controlls.registeredUsers.size();
	}

	@Then("an error massage {string} should display")
	public void an_error_massage_should_display(String string) {
		//assertEquals(string,s);
	    assertEquals(beforeR+1, afterR);
	}

	@Then("an information message {string} should displayed")
	public void an_information_message_should_displayed(String string) {
		//assertEquals(string,s);
	    assertEquals(beforeR, afterR);
	    
	}


}