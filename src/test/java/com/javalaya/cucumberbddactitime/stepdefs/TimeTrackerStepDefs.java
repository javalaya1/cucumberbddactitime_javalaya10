package com.javalaya.cucumberbddactitime.stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.javalaya.cucumberbddactitime.pageobjects.TimeTrackerPage;
import com.javalaya.cucumberbddactitime.utility.BrowserFactory;

import io.cucumber.java.en.Then;

public class TimeTrackerStepDefs {
	WebDriver driver = BrowserFactory.getDriver();

	@Then("Validates the {string} of the time track page")
	public void validates_the_title_of_the_time_track_page(String expectedTitle) {
		TimeTrackerPage ttp = new TimeTrackerPage(driver);
		String actualTitle = ttp.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
