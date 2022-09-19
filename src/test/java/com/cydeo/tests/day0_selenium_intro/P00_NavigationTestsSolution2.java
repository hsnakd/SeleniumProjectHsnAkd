package com.cydeo.tests.day0_selenium_intro;


import com.cydeo.utilities.BrowserFactory;
import com.cydeo.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class P00_NavigationTestsSolution2 {

	public static void main(String[] args) {
		testBrowser("Chrome");
		// testBrowser("Edge");
		testBrowser("Firefox");

		//if you're using Mac
		testBrowser("Safari");
	}

	//one test case for all the browsers
	//just pass the browser type as a parameter
	public static void testBrowser(String browserType){
		WebDriver driver = BrowserFactory.getDriver(browserType);
		driver.get("https://google.com");
		String titleFromGoogle = driver.getTitle();

		driver.get("https://etsy.com");
		String titleFromEtsy = driver.getTitle();

		driver.navigate().back();
		String titleFromGoogle2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		driver.navigate().forward();
		String titleFromEtsy2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);

		driver.quit();
	}

}
