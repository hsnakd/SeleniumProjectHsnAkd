package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList2 {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        // identify the year element
        WebElement dropdownYear = driver.findElement(By.id("year"));

        // wrap this element inside Select object
        Select selectYear = new Select(dropdownYear);

        // use ready methods to select option
        selectYear.selectByValue("1984");

        // identify the month element
        WebElement dropdownMonth = driver.findElement(By.id("month"));

        // wrap this element inside Select object
        Select selectMonth = new Select(dropdownMonth);

        // use ready methods to select option
        selectMonth.selectByIndex(4);


        // identify the day element
        WebElement dropdownDay = driver.findElement(By.id("day"));

        // wrap this element inside Select object
        Select selectDay = new Select(dropdownDay);

        // use ready methods to select option
        selectDay.selectByIndex(2);

        // quit the browser
        driver.quit();

    }
}
