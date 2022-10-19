Feature: Searching for a user tips history 
Background: The System has a the following Users 
	Given that the admin is logged in 
	And these users are contained
	|rosol   | tuhul  |
	|mohammad | zagha |
	|amer     | zagha|
	
	
 Scenario: Searching for a registered User
	Given that the admin is logged in 
	And that the user has the trips amman and turky in  
	When the Admin searches for the user "mohammad" 
	Then the Trips with the name "Amman" and "turky" is found
	
