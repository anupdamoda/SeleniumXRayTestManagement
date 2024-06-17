@ACE-20
Feature: [Test]: LoggedIn User View: The Valid User is able to navigate through Login and enter into Product Page

	#This Test is regarding the LoggedIn User View
  @TEST_ACE-14
  Scenario: [Test]: LoggedIn User View: The Valid User is able to navigate through Login and enter into Product Page
    Given User navigates to the Login page
    When User successfully enters the log in details
    Then User should be able to view the product category page