package com.javalaya.cucumberbddactitime.stepdefs;

import com.javalaya.cucumberbddactitime.utility.BrowserFactory;

import io.cucumber.java.After;

public class Hooks {
	@After
	public void closeBrowser() {
		BrowserFactory.closeAllBrowserInstances();
	}
}
