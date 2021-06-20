$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/trifacta/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Log into the website, display the product version information, and then logout",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verifying the Product version number is displayed",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "users launches the webapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid credentials \"\u003csheetname\u003e\" and \u003crownum\u003e lands on homepage check for the product version",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout from the website",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;",
  "rows": [
    {
      "cells": [
        "sheetname",
        "rownum"
      ],
      "line": 10,
      "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;1"
    },
    {
      "cells": [
        "Sheet1",
        "0"
      ],
      "line": 11,
      "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verifying the Product version number is displayed",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "users launches the webapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid credentials \"Sheet1\" and 0 lands on homepage check for the product version",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout from the website",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.users_launches_the_webapplication()"
});
formatter.result({
  "duration": 593774600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 31
    },
    {
      "val": "0",
      "offset": 43
    }
  ],
  "location": "LoginStep.user_enters_valid_credentials_and_rownum_lands_on_homepage_check_for_the_product_version(String,int)"
});
formatter.result({
  "duration": 24083336300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.logout_from_the_website()"
});
formatter.result({
  "duration": 5602122700,
  "status": "passed"
});
});