package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        // identify the select element
        WebElement dropdownElm = driver.findElement(By.xpath("//select[@id='dropdown']"));

        // wrap this element inside Select object
        Select selectObj = new Select(dropdownElm);

        // use ready methods to select option
        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        // verify determined option is selected
        String expectedOption = "Option 2";
        String actualOption = selectObj.getFirstSelectedOption().getText();

        if (actualOption.equals(expectedOption)) {
            System.out.println("Option 2 selection PASS");
        } else {
            System.out.println("Option 2 selection FAIL");
        }

        // quit the browser
        driver.quit();

    }
}
