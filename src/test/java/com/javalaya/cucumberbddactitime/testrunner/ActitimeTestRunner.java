package com.javalaya.cucumberbddactitime.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "actitimefeatures" }, glue = {
		"com.javalaya.cucumberbddactitime.stepdefs" }, 
tags = "@smoke", 
plugin = {"html:actitimereports/cucumber_reports/actitime_html_report.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class ActitimeTestRunner extends AbstractTestNGCucumberTests {

//	

}
