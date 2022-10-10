Feature: As a potential client i need to see only three sliders

  @Smoke
  Scenario: The client must see only three sliders
    Given The client is in practice automationtesting page
    When The client click on the Shop Menu
    And The client go back Home Menu
    And The client see only 3 arrivals
    And The client click one of the arrivals
    Then The client see the next page