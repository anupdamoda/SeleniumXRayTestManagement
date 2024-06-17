Feature: [Test]: New User Registration View

  #This Test is related to the New Registration User view
  @TEST_ACE-15
  Scenario: [Test]: New Registration View: Any user is able to navigate to New Registration button and enter into Registration Page
    Given User navigates to the Login page
    When User clicks on new Registration button
    Then User should be able to view the Registration page