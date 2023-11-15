$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Facebook.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on create account",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogin.click_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter first name",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.enter_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter last name",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.enter_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});