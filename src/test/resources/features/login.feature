Feature: Login to Osha app

  Scenario: As a user I need a Successful Login using valid Credentials
    Given  I navigate to login page
    When I enter "joaquinjqn2@gmail.com" as user and "defenseoftheancient" as password
    And I click on Login button
    And I Click on Settings icon
    Then I should see the email "joaquinjqn2@gmail.com" in the user email field on the Osha reporting mobile application

  Scenario: As a user I need to log out from the application
    Given  I navigate to login page
    When I enter "joaquinjqn2@gmail.com" as user and "defenseoftheancient" as password
    And I click on Login button
    And I Click on Settings icon
#    Given I navigate to login page
#    When I am logged in on Osha app with the following username "joaquinjqn2@gmail.com" and password "defenseoftheancient"
#    And I Click on Settings icon
    And I click on log out button
    And I confirm the Log out
    Then I should be logged out from Osha App