Feature: Register a new Injury

  Scenario: As a User I want to register a new Osha Injury
    Given I am logeed to the app with the "joaquinjqn2@gmail.com" as user and "defenseoftheancient" as password
    When I Click on New Injury icon
    And I select Type of Business
    And I introduce "established Name" as Established Name
    And I introduce "Site Address" as SiteAddress
    And I introduce "Mailing Address" as mailing address
    And I introduce "Address" as Address
    And I introduce "73773296" as phone
    And I introduce "Managment Official" as Management Official
    And I move it to next page
    And I Select Employee Type
    And I introduce "Compliant Name" as compliant name
    And I introduce "Compliant Address" as compliant address
    And I introduce "Compliant Phone" as compliant phone
    And I introduce "Compliant Email" as compliant Email
    And I move it to next page
    And I introduce "123456" as case number
    And I enter "Joaquin Gonzales" as employee name
    And I enter "Engineer" as Job tittle
    And I Select Today as Date Injury
    And I enter "Work Place" as where event occurs
    And I enter "The injury Description" as decription
    And I select Days away from work as Variant
    And I enter "away from work" away from work option
    And I select job Transfer restriction
    And I set a report today date
    And I click on save and send button
