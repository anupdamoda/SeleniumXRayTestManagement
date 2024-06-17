Feature: [Test]: General View

  #This Test is related to the General User View.
  @TEST_ACE-16
  Scenario: [Test]: General User View: Any user is able to view products without logging in
    Given User navigates to the Online products page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the Products




