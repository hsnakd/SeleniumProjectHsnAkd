package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/radio_buttons");

        /**  BLUE RADIO BUTTON CONTROL VIA .isSelected()         */
        //  WebElement checkbox1 = driver.findElement(By.id("blue"));
        WebElement blueRadioButton = driver.findElement(By.cssSelector("div>input[id='blue']"));
        System.out.println("Before click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());


        /**  RED RADIO BUTTON CONTROL VIA .isSelected()          */
        WebElement redRadioButton = driver.findElement(By.cssSelector("div>input[id='red']"));
        System.out.println("Before click redRadioButton.isSelected() = " + redRadioButton.isSelected());
        redRadioButton.click();
        System.out.println("After click redRadioButton.isSelected() = " + redRadioButton.isSelected());

        System.out.println("After click redRadioButton; blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        /**  DISABLE GREEN RADIO BUTTON CONTROL VIA .isSelected()          */
        WebElement greenRadioButton = driver.findElement(By.cssSelector("div>input[id='green']"));
        System.out.println("Before click greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        redRadioButton.click();
        System. out.println("After click greenRadioButton.isSelected() = " + greenRadioButton.isSelected());

        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());


        if (blueRadioButton.isSelected()) {
            System.out.println("blueRadioButton is already selected");
        } else {
            System.out.println("blueRadioButton is not selected");
        }

        if (redRadioButton.isSelected()) {
            System.out.println("redRadioButton is already selected");
        } else {
            redRadioButton.click();
            System.out.println("redRadioButton is selected by Automation");
        }


        driver.quit();

    }
}
