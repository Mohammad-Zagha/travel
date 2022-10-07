Feature: login
  Successful login validation

  Scenario: Successful authentication with valid credentials
    Given user is on the login page
    When user enters credentials to login
      | username    | password   |
      | user1       | passkey123 |
      | user2       | passkey345 |
Then Message displayed Login Successful
Then user should navigate to home page