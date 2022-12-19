package com.javalaya.cucumberbddactitime.stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.javalaya.cucumberbddactitime.pageobjects.LoginPage;
import com.javalaya.cucumberbddactitime.utility.BrowserFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	WebDriver driver = BrowserFactory.getDriver();
	LoginPage loginPage;

	{
		loginPage = new LoginPage(driver);
	}

	@Given("user enters invalid user name {string}")
	public void user_enters_invalid_user_name(String usenameinput) {

		loginPage.enterPassword(usenameinput);
	}

	@Given("user enters invalid password {string}")
	public void enterInvalidPassword(String passwordInput) {
		loginPage.enterPassword(passwordInput);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginInButton();
	}

	@Then("user gets error message on login page itself")
	public void user_gets_error_message_on_login_page_itself() {
		Assert.assertTrue(loginPage.displayErrorMessage());
	}

	@Then("Validates the error message {string}")
	public void validteErrorMessge(String errMsg) {
		String actualMesseage = loginPage.getInvlidUserErrorMessage();
		Assert.assertEquals(actualMesseage, errMsg);
	}

	@Given("user enters valid username as {string}")
	public void user_enters_valid_user_name(String usernameInput) {
		loginPage.enterUserName(usernameInput);
	}

	@Given("user enters valid password as {string}")
	public void enterValidPassword(String passwordInput) {
		loginPage.enterPassword(passwordInput);
	}
}
