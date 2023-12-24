@smoke
  Feature: F07_followUs | users could open followUs links
    Scenario: as a user, i want open facebook link, then show facebook page
      Given user in home page
      When user opens facebook link
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: as a user, i want open twitter link, then show facebook page
      Given user in home page
      When user opens twitter link
      Then "https://twitter.com/nopCommerce" is opened in new tab

    Scenario: as a user, i want open rrs link, then show facebook page
      Given user in home page
      When user opens rrs link
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

    Scenario: as a user, i want open youtube link, then show facebook page
      Given user in home page
      When user opens youtube link
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab