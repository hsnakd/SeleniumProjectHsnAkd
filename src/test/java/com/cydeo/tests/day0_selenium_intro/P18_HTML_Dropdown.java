package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P18_HTML_Dropdown {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        // click to open dropdown which has no select tag
        WebElement dropdownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropdownLink.click();

        // click item (link) with text Yahoo
        WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
        itemYahoo.click();


        // quit the browser
        driver.quit();

    }
}
