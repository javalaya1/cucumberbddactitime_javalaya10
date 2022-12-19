package com.javalaya.cucumberbddactitime.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentCustomReports {
//	ExtentReports

	static ExtentSparkReporter esr = new ExtentSparkReporter(new File("actitimereports/abc.html"));
	static ExtentReports er = new ExtentReports();
	

	static {
		esr.config().setDocumentTitle("Automation Report");
		esr.config().setReportName("report");
		esr.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		er.attachReporter(esr);
	}
	
	public static ExtentTest createReport(String text) {
		return er.createTest(text);
	}
}
