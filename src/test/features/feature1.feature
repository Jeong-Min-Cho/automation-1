@GoogleSearch
 Feature: Google
 Scenario: Type into Google
 Given user opens to "google.com"
 Then user types "typesomething" text into "GoogleSearchBoxText" textbox on "feature2" page
 And user waits "5" seconds