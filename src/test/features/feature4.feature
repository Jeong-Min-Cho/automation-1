@GoogleSearch
Feature: Google

Scenario: Type into Google
Given user navigates to "https://www.google.com/"
Then user types "HelloWorld" text into "GoogleSearchBox" textbox on "feature4" page
And user waits "5" seconds
Then user clicks "Search" button on "feature4" page
