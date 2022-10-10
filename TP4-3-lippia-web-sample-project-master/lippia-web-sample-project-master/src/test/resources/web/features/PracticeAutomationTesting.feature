Feature: As a potential client i need to see only three sliders

  @Smoke
  Scenario: Failed Login
    Given The client is in practice automationtesting page
    When The client click on My Account
    And The client enter empty username
    And The client now enter valid password 1234567
    And The client click on login button
    Then The client see a error




