package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P15_Z_FindElements {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size() = " + allColors.size());

        for (WebElement eachColor : allColors){
            System.out.println("Current Radio Button = " + eachColor.getAttribute("id"));
            System.out.println("Is enabled? = " + eachColor.isEnabled());
            System.out.println("Is selected? = " + eachColor.isSelected());
            System.out.println("Is displayed? = " + eachColor.isDisplayed());
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        }

        driver.quit();

    }
}
