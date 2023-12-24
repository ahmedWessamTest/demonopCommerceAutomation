@smoke
Feature: D08_wishlist | user can add products to wishlist
  Scenario: As a user, i want add a product to my wishlist, then display success message
    When user press on add to wishlist button in product
    Then display success message "The product has been added to your wishlist" with green background

  Scenario: As a user, i want add a product to my wishlist, then product added to wish list
    When user press on add to wishlist button in product
    And user press on wishlist button
    Then user get Qty value 1 or more