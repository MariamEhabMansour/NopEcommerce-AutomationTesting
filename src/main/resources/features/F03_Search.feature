@Smoke
Feature: Logged User could search for any product
  Scenario: User could search for any product and find relative items
    Given navigate to search page in website
    And user click on search field
    And user type what he or she want to search "Laptop"
    And user click on search button
    Then user could find relative results

  Scenario: User could search for any product by sku and find relative items
    Given navigate to search page in website
    And user click on search field
    And user type what he or she want to search "AP_MBP_13"
    And user click on search button
    And user click on search result
    Then user could find relative results for sku