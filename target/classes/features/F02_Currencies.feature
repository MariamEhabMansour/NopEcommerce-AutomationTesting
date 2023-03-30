@smoke
Feature: Currencies_ verify euro symbol is show on 4 products in home page
  Scenario: Currencies Feature
    Given navigate to url website
    When change current currency to EURO
    Then verify Euro Symbol is shown on the products



