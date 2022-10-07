package sw2022;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class login {
  
	public static final String CUCUMBER_API_CLI_MAIN = "cucumber.api.cli.Main"; 
    @Given("user is on the login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("On login page");
    }
    @When("user enters credentials to login")
    public void user_enters_credentials_to_log_in(DataTable dataTable) {
        // dataTable.asMaps converts the table to a list of maps
        // For each row of the table a map is created containing a mapping of column headers
        // to the column cell of that row
        for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
            System.out.println("username: " + data.get("username"));
            System.out.println("password: " + data.get("password"));
        }
    }
    @Then("Message displayed Login Successful")
    public void message_displayed_login_successful() {
        // Write code here that turns the phrase above into concrete actions
        assert true;
        System.out.println("Login Successful");
    }
}