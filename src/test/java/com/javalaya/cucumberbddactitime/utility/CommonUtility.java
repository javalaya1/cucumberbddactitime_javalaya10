package com.javalaya.cucumberbddactitime.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonUtility {

	public static void waitTimeInSeconds(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getCurrentDate() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd-hh_mm_ss"));
	}

	public static void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("actitimereports/" + getCurrentDate() + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeScreenshot(WebElement element) {
		TakesScreenshot ts = (TakesScreenshot) element;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("actitimereports/" + getCurrentDate() + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void takeFullScreenShot(WebDriver driver) {
		
	}
}
