Feature: Login to Osha app

  Scenario: As a user I need a Successful Login using valid Credentials
    Given  I navigate to login page
    When I enter "joaquinjqn2@gmail.com" as user and "defenseoftheancient" as password
    And I click on Login button
    Then I should see the email "joaquinjqn2@gmail.com" in the user email field on the Osha reporting mobile application