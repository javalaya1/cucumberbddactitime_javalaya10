package com.javalaya.cucumberbddactitime.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.javalaya.cucumberbddactitime.utility.CommonUtility;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void switchToWindow(int number) {
		List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(number));
	}

	public String getTitle() {
		CommonUtility.waitTimeInSeconds(3);
		return driver.getTitle();
	}

	public String getAttribute(WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}

}
