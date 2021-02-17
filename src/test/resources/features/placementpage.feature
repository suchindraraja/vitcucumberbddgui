Feature: placementpage test

Scenario: validate placemnt page test
 Given open browser and launch site
 When move to placements element and select super dream offer
 Then "placements" should be visible in the next page
 When close site 