package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {


	public static WebDriver getDriver(String browserType) {

		WebDriver driver;

		switch (browserType.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				if (!System.getProperty("os.name").toLowerCase().contains("windows"))
					//this exception might be new for you
					throw new WebDriverException("Your OS doesn't support Edge");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "safari":
				if (!System.getProperty("os.name").toLowerCase().contains("mac"))
					//this exception might be new for you
					throw new WebDriverException("Your OS doesn't support Safari");
				WebDriverManager.getInstance(SafariDriver.class).setup();
				driver = new SafariDriver();
				break;
			default:
				driver = null;
				throw new WebDriverException("There is no such a driver");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}



}
