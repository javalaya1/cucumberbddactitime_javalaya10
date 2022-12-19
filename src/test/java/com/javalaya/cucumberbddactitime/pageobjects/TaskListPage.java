package com.javalaya.cucumberbddactitime.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskListPage extends BasePage {
	private WebDriver driver;

	public TaskListPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement addNewButton;

	@FindBy(xpath = "//div[normalize-space()='+ New Customer']")
	private WebElement newCustomerButton;

	@FindBy(xpath = "//div[@class='customerNameDiv']/input")
	private WebElement customerNameTab;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTab;

	@FindBy(xpath = "//div[@class='components_button_label'][normalize-space()='Create Customer']")
	private WebElement createCustomer;

	@FindBy(xpath = "//span[@class='innerHtml']")
	private WebElement createdLabelText;

	@FindBy(xpath = "(//div[@class='searchFieldContainer'])[1]")
	private WebElement searchField;

	public void clickOnAddNewButton() {
		addNewButton.click();
	}

	public void clickOnNewCustomer() {
		newCustomerButton.click();
	}

	public void enterCustomerName(String clientName) {
		customerNameTab.clear();
		customerNameTab.sendKeys(clientName);
	}

	public void enterDescription(String description) {
		customerDescriptionTab.clear();
		customerDescriptionTab.sendKeys(description);
	}

	public void clickOnCreateCustomer() {
		createCustomer.click();
	}

	public String getConfirmationText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='innerHtml']")));
		return createdLabelText.getText();
	}

	public void searchCustomerName(String customerName) {
		searchField.sendKeys(customerName);
	}

}
