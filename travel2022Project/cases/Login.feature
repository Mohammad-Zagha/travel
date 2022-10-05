Feature: Login 

Scenario: User attemps to login with right UserName and Password
Given that the user the right UserName and Password
When the UserName and Password gets Validated 
Then the user gets  to the main Menu
 
Scenario: User attemps to login with Wrong UserName and Password
Given that the user desent provides the right UserName and Password
When the UserName and Password gets Validated Again 
Then the user gets a wrong UserName or Password Message
And has to try to login again