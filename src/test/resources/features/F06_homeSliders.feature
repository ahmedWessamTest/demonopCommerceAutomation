@smoke
  Feature:F06_homeSliders | user can click in product in slider
    Scenario: As a user, i want click on product in sliders, then show the product
      Given user in home page
      When click on samsung Galaxy S22 slider imag
      Then user go to product who clicked with "https://demo.nopcommerce.com/samsung-Galaxyy-s22" URL

    Scenario: As a user, i want click on product in sliders, then show the product
      Given user in home page
      When click on samsung Galaxy iphone 14 pro imag
      Then user go to product who clicked with "https://demo.nopcommerce.com/iphone-14-Pro" URL