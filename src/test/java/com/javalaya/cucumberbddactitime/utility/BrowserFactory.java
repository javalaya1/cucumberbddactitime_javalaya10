package com.javalaya.cucumberbddactitime.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private static WebDriver driver;

	private static void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "actitimebrowserexes/chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "actitimebrowserexes/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	private static void openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "actitimebrowserexes/msedgedriver.exe");
		driver = new EdgeDriver();
	}

	public static WebDriver openBrowser(String browserName) {
		switch (browserName.toLowerCase().intern()) {
		case "edge":
			openEdgeBrowser();
			break;
		case "chrome":
			openChromeBrowser();
			break;
		case "firefox":
			openFirefoxBrowser();
			break;
		}
		return driver;
	}

	public static void closeCurrentBrowser() {
		driver.close();
	}

	public static void closeAllBrowserInstances() {
		driver.quit();
	}

	public static void openUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
