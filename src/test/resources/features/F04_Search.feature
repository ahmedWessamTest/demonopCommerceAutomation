#@smoke
  Feature: F04_Search | user can search about any product with search bar

    Scenario Outline: As a user, i want search about product with product name, so that show products with search
      Given user in home page
      When enter about what he want search like "<search>"
      And click enter
      Then user get products with his search name "<search>"

      Examples:
      |search|
      |book  |
      |laptop|
      |nike  |
#@smoke
    Scenario Outline: As a user, i want search about product with product sku, so than show products i need
      Given user in home page
      When enter about what he want search like "<search>"
      And click enter
      And click on product
      Then user get products with his search sku "<search>"

      Examples:
      |search|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|