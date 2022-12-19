package com.javalaya.cucumberbddactitime.stepdefs;

import com.javalaya.cucumberbddactitime.utility.BrowserFactory;
import com.javalaya.cucumberbddactitime.utility.ProperitesFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PreCondition {

	@Given("user opened the required browser")
	public void user_opened_the_required_browser() {
		String browserName = ProperitesFileReader.getProp("testconfig.browsername");
		BrowserFactory.openBrowser(browserName);
	}

	@When("user launched the web browser")
	public void user_launched_the_web_browser() {
		String appurl = ProperitesFileReader.getProp("testconfig.url");
		BrowserFactory.openUrl(appurl);
	}
}
