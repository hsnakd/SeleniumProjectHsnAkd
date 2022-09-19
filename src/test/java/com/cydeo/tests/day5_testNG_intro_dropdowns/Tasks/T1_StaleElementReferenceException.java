package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementReferenceException {

    public static void main(String[] args) throws InterruptedException {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        //button[@onclick='addElement()']
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteElementButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("deleteElementButton.isDisplayed() before = " + deleteElementButton.isDisplayed());

        // 5. Click to “Delete” button.
        deleteElementButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        try {

            System.out.println("deleteElementButton.isDisplayed() after = " + deleteElementButton.isDisplayed());

        }catch (StaleElementReferenceException e){

            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");

        }


        driver.quit();
    }
}

/*
            XPATH PRACTICES
            DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
            TC #1: StaleElementReferenceException handling
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/add_remove_elements/
                3. Click to “Add Element” button
                4. Verify “Delete” button is displayed after clicking.
                5. Click to “Delete” button.
                6. Verify “Delete” button is NOT displayed after clicking.
            USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */