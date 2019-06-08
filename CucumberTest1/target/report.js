$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AddCustomer.feature");
formatter.feature({
  "name": "To Test add Customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test you add customer plan sucessfully and not generate the customer ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us2"
    }
  ]
});
formatter.step({
  "name": "he user is in Telecom home page",
  "keyword": "Given "
});
formatter.step({
  "name": "The User click an add Customer",
  "keyword": "And "
});
formatter.step({
  "name": "The User is invalid details to all the fields\"\u003cFName\u003e\",\"\u003cLName\u003e\",\"\u003cEmail\u003e\",\"\u003cAddress\u003e\",\"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The User Click on Submit Button",
  "keyword": "And "
});
formatter.step({
  "name": "The each filed error msg displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "Email",
        "Address",
        "phone"
      ]
    },
    {
      "cells": [
        "123",
        "345",
        "123",
        "123@,.",
        "KALAI"
      ]
    },
    {
      "cells": [
        "345",
        "898",
        "4567",
        "4567,.\u0026 test street",
        "jasm"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test you add customer plan sucessfully and not generate the customer ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "he user is in Telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.he_user_is_in_Telecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click an add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_User_click_an_add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is invalid details to all the fields\"123\",\"345\",\"123\",\"123@,.\",\"KALAI\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_User_is_invalid_details_to_all_the_fields(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User Click on Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_User_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The each filed error msg displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_each_filed_error_msg_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test you add customer plan sucessfully and not generate the customer ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "he user is in Telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.he_user_is_in_Telecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click an add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_User_click_an_add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User is invalid details to all the fields\"345\",\"898\",\"4567\",\"4567,.\u0026 test street\",\"jasm\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_User_is_invalid_details_to_all_the_fields(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User Click on Submit Button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.the_User_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The each filed error msg displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_each_filed_error_msg_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});