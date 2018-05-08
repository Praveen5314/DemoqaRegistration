$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Demoqa Registration Details",
  "description": "",
  "id": "demoqa-registration-details",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demoqa"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user in demoqa website",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationSteps.the_user_in_demoqa_website()"
});
formatter.result({
  "duration": 15541128168,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify all textboxes",
  "description": "",
  "id": "demoqa-registration-details;verify-all-textboxes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@textbox"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "The user enters firstName, lastName, phonenumber, username, email, password, confirmpassword",
  "rows": [
    {
      "cells": [
        "Lionel",
        "Messi",
        "8383788880",
        "LeoMessi",
        "messimail@gmail.com",
        "leomessi",
        "leomessi"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The user verifies the entered text in firstName, lastName, phonenumber, username, email, password, confirmpassword",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.the_user_enters_firstName_lastName_phonenumber_username_email_password_confirmpassword(DataTable)"
});
formatter.result({
  "duration": 2147834939,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.the_user_verifies_the_entered_text_in_firstName_lastName_phonenumber_username_email_password_confirmpassword()"
});
formatter.result({
  "duration": 181784683,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user in demoqa website",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationSteps.the_user_in_demoqa_website()"
});
formatter.result({
  "duration": 27567937851,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify maritalstatus radiobutton",
  "description": "",
  "id": "demoqa-registration-details;verify-maritalstatus-radiobutton",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@radio"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "The user choose maritalstatus as single",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user verifies the selected maritalstatus",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.the_user_choose_maritalstatus_as_single()"
});
formatter.result({
  "duration": 121649340,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.the_user_verifies_the_selected_maritalstatus()"
});
formatter.result({
  "duration": 1434728553,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user in demoqa website",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationSteps.the_user_in_demoqa_website()"
});
formatter.result({
  "duration": 14796508261,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify hobby checkbox",
  "description": "",
  "id": "demoqa-registration-details;verify-hobby-checkbox",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@checkbox"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "The user choose hobby as dance and reading",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The user verifies the selected hobby",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.the_user_choose_hobby_as_dance_and_reading()"
});
formatter.result({
  "duration": 224618696,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.the_user_verifies_the_selected_hobby()"
});
formatter.result({
  "duration": 842651822,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user in demoqa website",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationSteps.the_user_in_demoqa_website()"
});
formatter.result({
  "duration": 13684660500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify the country dropdown",
  "description": "",
  "id": "demoqa-registration-details;verify-the-country-dropdown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@dropdown"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "The user select the country as India",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "The user verifies the country India selected",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.the_user_select_the_country_as_India()"
});
formatter.result({
  "duration": 2193371033,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.the_user_verifies_the_country_India_selected()"
});
formatter.result({
  "duration": 867132799,
  "status": "passed"
});
});