@demoqa
Feature: Demoqa Registration Details

Background: 
 Given The user in demoqa website

@textbox
Scenario: Verify all textboxes
When The user enters firstName, lastName, phonenumber, username, email, password, confirmpassword
| Lionel | Messi | 8383788880 | LeoMessi | messimail@gmail.com | leomessi | leomessi |
Then The user verifies the entered text in firstName, lastName, phonenumber, username, email, password, confirmpassword

@radio
Scenario: Verify maritalstatus radiobutton 
When The user choose maritalstatus as single 
Then The user verifies the selected maritalstatus

@checkbox
Scenario: Verify hobby checkbox
When The user choose hobby as dance and reading
Then The user verifies the selected hobby

@dropdown
Scenario: Verify the country dropdown 
When The user select the country as India
Then The user verifies the country India selected
 


