@login
Feature: Sign in
  Checking the user login process with previously created account

  @login_successful
  Scenario: Sign in with previously registered user
    Given I am on home page
    When I go to sign in section
    And I sign in with my credentials on login page
    Then I am logged in
    And I am on my account page
