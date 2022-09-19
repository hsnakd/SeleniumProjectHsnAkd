package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.BrowserFactory;
import com.cydeo.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class P00_NavigationTestsSolution1 {

	//call the test methods
	public static void main(String[] args) {
		testForChrome();
		testForFirefox();
		testForSafari();
	}


	//the test case for Chrome
	public static void testForChrome(){
		//initiate a web driver object from BrowserFactory class
		WebDriver driver = BrowserFactory.getDriver("Chrome");

		//go to google
		driver.get("https://google.com");

		//get title of the page
		String titleFromGoogle = driver.getTitle();

		//go to etsy
		driver.get("https://etsy.com");

		//get title of the page
		String titleFromEtsy = driver.getTitle();

		//go back
		driver.navigate().back();

		//get title of the page
		String titleFromGoogle2 = driver.getTitle();

		//verify the titles using the methods from Utility class
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		//go forward
		driver.navigate().forward();

		//get title of the page
		String titleFromEtsy2 = driver.getTitle();

		//verify the titles using the methods from Utility class
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);

		//close all the tabs and quit
		driver.quit();
	}

	//the test case for Firefox
	public static void testForFirefox(){
		WebDriver driver = BrowserFactory.getDriver("Firefox");
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



	//the test case for Safari, if you're using Mac computer
	public static void testForSafari(){
		WebDriver driver = BrowserFactory.getDriver("Safari");
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
