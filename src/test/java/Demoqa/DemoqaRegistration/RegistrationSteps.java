package Demoqa.DemoqaRegistration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends Base {
	String selectedCountry;

	@Given("^the user in Demoqa Website$")
	public void the_user_in_Demoqa_Website()  {
		driver=getDriver("http://demoqa.com/registration/");
	}

	@When("^the user enters FirstName, LastName, PhoneNumber, UserName and Email$")
	public void the_user_enters_FirstName_LastName_PhoneNumber_UserName_and_Email()  {
		RegistrationPOM pomObj=new RegistrationPOM();
		sendData(pomObj.getFirstName(),"Lionel");
		sendData(pomObj.getLastName(), "Messi");
		sendData(pomObj.getPhone(), "7827373738");
		sendData(pomObj.getUserName(), "LeoMessi");
		sendData(pomObj.getEmail(), "LeoMessi@gmail.com");
	   
	}

	@Then("^the user verifies the entered text in FirstName, LastName, PhoneNumber, UserName and Email$")
	public void the_user_verifies_the_entered_text_in_FirstName_LastName_PhoneNumber_UserName_and_Email()  {
	 RegistrationPOM pomObj=new RegistrationPOM();
	 Assert.assertEquals("Lionel", pomObj.getFirstName().getAttribute("value"));
	 Assert.assertEquals("Messi", pomObj.getLastName().getAttribute("value"));
	 Assert.assertEquals("7827373738", pomObj.getPhone().getAttribute("value"));
	 Assert.assertEquals("LeoMessi", pomObj.getUserName().getAttribute("value"));
	 Assert.assertEquals("LeoMessi@gmail.com", pomObj.getEmail().getAttribute("value"));
	 quit(driver);
	}

	@When("^the user choose MaritalStatusRadio$")
	public void the_user_choose_MaritalStatusRadio()  {
		RegistrationPOM pomObj=new RegistrationPOM();
		click(pomObj.getStatusSingle());
		
	}

	@Then("^the user verifies the selected MaritalStatusRadio$")
	public void the_user_verifies_the_selected_MaritalStatusRadio() {
		RegistrationPOM pomObj=new RegistrationPOM();
		Assert.assertTrue(pomObj.getStatusSingle().isSelected());
		quit(driver);
	}

	@When("^the user choose Hobby as Dance and Reading$")
	public void the_user_choose_Hobby_as_Dance_and_Reading() {
		RegistrationPOM pomObj=new RegistrationPOM();
		click(pomObj.getHobbyDance());
		click(pomObj.getHobbyReading());
		
}

	@Then("^the user verifies the selected Hobby$")
	public void the_user_verifies_the_selected_Hobby()  {
		RegistrationPOM pomObj=new RegistrationPOM();
		Assert.assertTrue(pomObj.getHobbyDance().isSelected());
		Assert.assertTrue(pomObj.getHobbyReading().isSelected());
		quit(driver);
	}

	@When("^the user select the Country$")
	public void the_user_select_the_Country() {
		RegistrationPOM pomObj=new RegistrationPOM();
		Select countrySelect=new Select(pomObj.getDropDownCountry());
		countrySelect.selectByVisibleText("India");
		selectedCountry=countrySelect.getFirstSelectedOption().getText();
		
	}

	@Then("^the user verifies the Country selected$")
	public void the_user_verifies_the_Country_selected()  {
		RegistrationPOM pomObj=new RegistrationPOM();
		Assert.assertEquals("India", selectedCountry);
		quit(driver);
	}


}
