Feature: User login
	Description: The User logs into the System
	
	
Scenario: User can login
	Given that the User is not logged in
	And the password is "test123" the username is "usertest"
	Then the user login succeeds
	And the user is logged in
	
Scenario: user has the wrong password or username
	Given that the user is not logged in
	And the password is "test" and/or username is "user"
	Then the user login fails
	And the user is not logged in
