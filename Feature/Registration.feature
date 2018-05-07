@demoqa
Feature: Demoqa Registration Details

Background: 
 Given the user in Demoqa Website

@textbox
Scenario: Verify all Textboxes
When the user enters FirstName, LastName, PhoneNumber, UserName and Email
Then the user verifies the entered text in FirstName, LastName, PhoneNumber, UserName and Email

@radio
Scenario: Verify MaritalStatus RadioButton 
When the user choose MaritalStatusRadio 
Then the user verifies the selected MaritalStatusRadio

@checkbox
Scenario: Verify Hobby Checkbox
When the user choose Hobby as Dance and Reading
Then the user verifies the selected Hobby

@dropdown
Scenario: Verify the Country Dropdown 
When the user select the Country
Then the user verifies the Country selected
 


