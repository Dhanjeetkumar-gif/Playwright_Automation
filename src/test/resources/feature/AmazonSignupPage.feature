Feature: test
  Scenario: test search scenario
    Given user is on amazon signup page "https://www.amazon.in"
    When user enters "phone" in search field
    Then text "phone" is displayed