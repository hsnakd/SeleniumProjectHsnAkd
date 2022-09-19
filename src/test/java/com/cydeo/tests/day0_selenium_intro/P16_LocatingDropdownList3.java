package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList3 {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        // identify the year element
        WebElement dropdownState = driver.findElement(By.id("state"));

        // wrap this element inside Select object
        Select selectState = new Select(dropdownState);

        // use ready methods to select option
        selectState.selectByValue("FL");

        // quit the browser
        driver.quit();

    }
}
