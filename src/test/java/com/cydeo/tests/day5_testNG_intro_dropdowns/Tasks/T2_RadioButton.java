package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

        //5. quit
        // driver.quit();
    }
}
/*
            XPATH PRACTICES
            DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
            TC #2: Radiobutton handling
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/radio_buttons
                3. Click to “Hockey” radio button
                4. Verify “Hockey” radio button is selected after clicking.
            USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */