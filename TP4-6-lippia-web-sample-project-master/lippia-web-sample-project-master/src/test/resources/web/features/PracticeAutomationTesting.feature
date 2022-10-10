Feature: As a potential client i need enter in my count

  @Smoke
  Scenario: The client want his count
    Given The client is in practice automationtesting page
    When The client click on My Account
    And The client enter with username yermangl@gmail.com
    And The client enter with password 123xxx$$$456
    And The client click on login button
    And The client must successfully login to the web page
    And The client click on my Account link
    And Click on logout button
    Then The client see successfully comes out from the site




