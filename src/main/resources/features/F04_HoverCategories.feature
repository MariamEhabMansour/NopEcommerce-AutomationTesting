@Smoke
Feature:Actions class to hover on one of main categories then click on sub category
  Scenario:user could select different Categories
    Given navigate to url website
    And user hover and select random category
    Then user could find relative results in category page
