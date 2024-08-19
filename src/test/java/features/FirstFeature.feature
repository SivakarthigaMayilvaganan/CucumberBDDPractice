@EnterText
Feature: Text box validation

  Scenario: Enter text in the textbox
    Given User is on landing page
    When User clicks the textbox option from Element
    Then User enters the "Siva" in Type your name textbox
  
    