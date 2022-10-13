Feature: User Registration
Scenario: User registratioin with Right data
Given that the user enters the username "mohammad" and password "zagha"
And  the user is one of the following users
|rosol   | tuhul  |
|mohammad | zagha |
|amer     | zagha|
And the user is Logged out

Then user registration should be successful


