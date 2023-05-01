Feature: test feature 2

  Scenario: testing for the first feature for 4
    Given user types "https://www.amazon.com" for amazon
    Then Searches for "iPhone" in Amazon
    Then Validates the presence of header "Amazon"

  Scenario: testing for the first feature for 3
    Given user types "https://www.flipkart.com/" for flipkart
    When the modal appears close it
    Then Searches for "iPhone" in Flipkart
    Then Validates the presence of header "Flipkart"

