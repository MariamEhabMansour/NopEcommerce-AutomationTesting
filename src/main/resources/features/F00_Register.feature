@smoke
Feature: Register_ user could registration to the system with valid data
  Scenario: valid Registration
    Given navigate to url website
    And Go to register page
    When  Enter valid Data
    And  click on Register button
    Then  verify that account created successfully


