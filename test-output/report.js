$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TrifactaLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Log into the website, display the product version information, and then logout",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying the Product version number is displayed",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Trifacta"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "users launches the webapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters valid credentials \"\u003csheetname\u003e\" and \u003crownum\u003e lands on homepage check for the product version",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "logout from the website as well",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;",
  "rows": [
    {
      "cells": [
        "sheetname",
        "rownum"
      ],
      "line": 11,
      "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;1"
    },
    {
      "cells": [
        "Sheet1",
        "0"
      ],
      "line": 12,
      "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verifying the Product version number is displayed",
  "description": "",
  "id": "log-into-the-website,-display-the-product-version-information,-and-then-logout;verifying-the-product-version-number-is-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Trifacta"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "users launches the webapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters valid credentials \"Sheet1\" and 0 lands on homepage check for the product version",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "logout from the website as well",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.users_launches_the_webapplication()"
});
formatter.result({
  "duration": 97005400400,
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
  "duration": 67188371000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.logout_from_the_website()"
});
formatter.result({
  "duration": 5278932600,
  "status": "passed"
});
});