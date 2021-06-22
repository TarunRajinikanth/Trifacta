Feature: Launch Google

@google
Scenario: Launch Google in browser

Given user launches google
Then Enters "Selenium" in search bar
Then Clicks enter