package com.javalaya.cucumberbddactitime.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void enterUserName(String userNameInput) {
		WebElement userName_element = driver.findElement(By.id("username"));
		userName_element.sendKeys(userNameInput);
	}

	public void enterPassword(String passwordInput) {
		WebElement pass_element = driver.findElement(By.name("pwd"));
		pass_element.sendKeys(passwordInput);
	}

	public void clickLoginInButton() {
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
	}

	public String getInvlidUserErrorMessage() {
		WebElement errmsg = driver.findElement(By.xpath("//td[@valign='top']/span[@class='errormsg']"));
		return errmsg.getText();
	}

	public boolean displayErrorMessage() {
		WebElement errmsg = driver.findElement(By.xpath("//td[@valign='top']/span[@class='errormsg']"));
		return errmsg.isDisplayed();
	}

}
