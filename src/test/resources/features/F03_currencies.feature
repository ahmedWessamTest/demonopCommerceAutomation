#@smoke
  Feature: F03_currencies | User can change currencies to adapt with own money
    Scenario: As a user, I want to change Currency to Euro
    Given user in home page
    When select "Euro" currency
    Then all products change to Euro currency and change sign to "€"