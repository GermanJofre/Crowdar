Feature: As a potential client i need to see only three sliders

  @Smoke
  Scenario: The client
    Given The client is in practice automationtesting page
    When The client click on My Account
    And The client enter empty email
    And The client enter empty password
    And The client click on register button
    Then The client see a warning message




