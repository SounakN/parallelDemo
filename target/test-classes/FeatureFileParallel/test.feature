Feature: test feature 1


  Scenario: testing for the first feature for 1
    Given user types "https://www.flipkart.com/" for flipkart
    When the modal appears close it
    Then Searches for "iPhone" in Flipkart
    Then Validates the presence of header "Flipkart"

  Scenario: testing for the first feature for 2
    Given user types "https://www.amazon.com" for amazon
    Then Searches for "iPhone" in Amazon
    Then Validates the presence of header "Amazon"


