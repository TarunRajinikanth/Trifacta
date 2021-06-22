$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Launch Google",
  "description": "",
  "id": "launch-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Launch Google in browser",
  "description": "",
  "id": "launch-google;launch-google-in-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@google"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches google",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enters \"Selenium\" in search bar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks enter",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.user_launches_google()"
});
formatter.result({
  "duration": 6213941100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 8
    }
  ],
  "location": "GoogleSearch.enters_in_search_bar(String)"
});
formatter.result({
  "duration": 161085701,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.clicks_enter()"
});
formatter.result({
  "duration": 7591473800,
  "status": "passed"
});
});