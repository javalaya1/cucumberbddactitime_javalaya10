package com.javalaya.cucumberbddactitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackerPage extends BasePage {
	private WebDriver driver;

	public TimeTrackerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	


}