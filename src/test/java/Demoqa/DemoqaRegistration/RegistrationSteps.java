package Demoqa.DemoqaRegistration;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends Base {
	String selectedCountry;

	@Given("^The user in demoqa website$")
	public void the_user_in_demoqa_website()  {
		driver=getDriver("http://demoqa.com/registration/");
	}

	@When("^The user enters firstName, lastName, phonenumber, username, email, password, confirmpassword$")
	public void the_user_enters_firstName_lastName_phonenumber_username_email_password_confirmpassword(DataTable txtboxValues)  {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		List<List<String>> userData = txtboxValues.asLists(String.class);
		sendData(register_page_elements.getFirstName(),userData.get(0).get(0));
		sendData(register_page_elements.getLastName(), userData.get(0).get(1));
		sendData(register_page_elements.getPhone(), userData.get(0).get(2));
		sendData(register_page_elements.getUserName(), userData.get(0).get(3));
		sendData(register_page_elements.getEmail(), userData.get(0).get(4));
		sendData(register_page_elements.getPw(), userData.get(0).get(5));
		sendData(register_page_elements.getPwConfirm(), userData.get(0).get(6));
	   
	}

	@Then("^The user verifies the entered text in firstName, lastName, phonenumber, username, email, password, confirmpassword$")
	public void the_user_verifies_the_entered_text_in_firstName_lastName_phonenumber_username_email_password_confirmpassword()  {
	 RegistrationPOM register_page_elements=new RegistrationPOM();
	 Assert.assertEquals("Lionel", register_page_elements.getFirstName().getAttribute("value"));
	 Assert.assertEquals("Messi", register_page_elements.getLastName().getAttribute("value"));
	 Assert.assertEquals("8383788880", register_page_elements.getPhone().getAttribute("value"));
	 Assert.assertEquals("LeoMessi", register_page_elements.getUserName().getAttribute("value"));
	 Assert.assertEquals("messimail@gmail.com", register_page_elements.getEmail().getAttribute("value"));
	 Assert.assertEquals("leomessi", register_page_elements.getPw().getAttribute("value"));
	 Assert.assertEquals("leomessi", register_page_elements.getPwConfirm().getAttribute("value"));
	 
	 //quit(driver);
	}

	@When("^The user choose maritalstatus as single$")
	public void the_user_choose_maritalstatus_as_single()  {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		click(register_page_elements.getStatusSingle());
		
	}

	@Then("^The user verifies the selected maritalstatus$")
	public void the_user_verifies_the_selected_maritalstatus() {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		Assert.assertTrue(register_page_elements.getStatusSingle().isSelected());
		quit(driver);
	}

	@When("^The user choose hobby as dance and reading$")
	public void the_user_choose_hobby_as_dance_and_reading() {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		click(register_page_elements.getHobbyDance());
		click(register_page_elements.getHobbyReading());
		
}

	@Then("^The user verifies the selected hobby$")
	public void the_user_verifies_the_selected_hobby()  {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		Assert.assertTrue(register_page_elements.getHobbyDance().isSelected());
		Assert.assertTrue(register_page_elements.getHobbyReading().isSelected());
		quit(driver);
	}

	@When("^The user select the country as India$")
	public void the_user_select_the_country_as_India() {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		Select countrySelect=new Select(register_page_elements.getDropDownCountry());
		countrySelect.selectByVisibleText("India");
		selectedCountry=countrySelect.getFirstSelectedOption().getText();
		
	}

	@Then("^The user verifies the country India selected$")
	public void the_user_verifies_the_country_India_selected()  {
		RegistrationPOM register_page_elements=new RegistrationPOM();
		Assert.assertEquals("India", selectedCountry);
		quit(driver);
	}


}
