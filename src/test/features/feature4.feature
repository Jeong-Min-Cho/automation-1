@GoogleSearch
 Feature: Google
 Scenario: Type into Google
 Given user navigates to "https://www.google.com/"
 Then user types "fsf" text into "GoogleSearchBoxText" textbox on "feature2" page
 And user waits "5" seconds