Feature: As a potential client i need to see only three sliders

  @Smoke
  Scenario: The client must see only three sliders
    Given The client is in practice automationtesting page
    When The client click on the Shop Menu
    And The client go back Home Menu
    Then The client see only 3 sliders
  @Smoke
  Scenario: The client