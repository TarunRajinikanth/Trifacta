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
  "duration": 7023980900,
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
  "duration": 216839900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.clicks_enter()"
});
formatter.result({
  "duration": 7993568500,
  "status": "passed"
});
formatter.uri("TrifactaLogin.feature");
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
  "duration": 100044501200,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 97.802\n  (Session info: headless chrome\u003d91.0.4472.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-84GA0B6G\u0027, ip: \u0027192.168.0.113\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.114, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\Tarun\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53161}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7932e79466905b11c9c7067a06427439\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.trifacta.stepDefinition.LoginStep.users_launches_the_webapplication(LoginStep.java:30)\r\n\tat ✽.Given users launches the webapplication(TrifactaLogin.feature:6)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.logout_from_the_website()"
});
formatter.result({
  "status": "skipped"
});
});