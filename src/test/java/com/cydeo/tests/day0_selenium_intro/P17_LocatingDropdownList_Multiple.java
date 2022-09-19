package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropdownList_Multiple {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        // identify the dropdown with multiple select options
        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));

        // wrap this element inside Select object
        Select multiItemSelect = new Select(multiItemDropdown);

        // check if
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        // select items
        multiItemSelect.selectByIndex(2);
        multiItemSelect.selectByValue("ruby");
        multiItemSelect.selectByVisibleText("Python");

        // deselect items
        multiItemSelect.deselectByIndex(2);
        multiItemSelect.deselectByValue("ruby");
        multiItemSelect.deselectByVisibleText("Python");
        multiItemSelect.deselectAll();


        // quit the browser
        driver.quit();

    }
}
