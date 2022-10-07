Feature: Login 

Background: the system has the following users 
Given the users in the system are
				|Mohammad|Pass123|

Scenario: User attemps to login with right UserName and Password
Given that the user enters the right UserName and Password
When user the user calles the login function
Then the user gets to the main Menu
 