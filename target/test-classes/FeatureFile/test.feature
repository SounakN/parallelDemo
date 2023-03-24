Feature: test feature 1

  Scenario: testing for the first feature for 1
    Given user types "https://www.google.com"
    Then Searches for "Steven Wilson" in "Google"
    Then Validates the presence of header "Google"
  Scenario: testing for the first feature for 2
    Given user types "https://www.amazon.com"
    Then Searches for "iPhone" in "Amazon"
    Then Validates the presence of header "Amazon"
