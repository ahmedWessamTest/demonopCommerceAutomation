#@smoke
Feature: F05_hoverCategories | user can chose any category he need
  Scenario: As a user, i want chose specific category from category bar then go to all product with this category
    Given user in home page
    When hover on random category
    And chose random sub-category
    Then show all products that user chose
