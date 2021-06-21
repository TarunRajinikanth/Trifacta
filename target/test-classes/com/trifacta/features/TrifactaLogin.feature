Feature: Log into the website, display the product version information, and then logout

@Trifacta
Scenario Outline: Verifying the Product version number is displayed

Given users launches the webapplication
When user enters valid credentials "<sheetname>" and <rownum> lands on homepage check for the product version
Then logout from the website as well

Examples:
|sheetname|rownum|
|Sheet1|0|