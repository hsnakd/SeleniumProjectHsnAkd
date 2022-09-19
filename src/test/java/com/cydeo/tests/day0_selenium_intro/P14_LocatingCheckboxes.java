package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/checkboxes");

        /**  CHECKBOX CONTROL VIA .isSelected()         */
        //  WebElement checkbox1 = driver.findElement(By.id("box1"));
        //  WebElement checkbox1 = driver.findElement(By.name("checkbox1"));
        WebElement checkbox1 = driver.findElement(By.cssSelector("input[name='checkbox1']"));
        System.out.println("Before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click checkbox1.isSelected() = " + checkbox1.isSelected());

/*      //  CHECKBOX CONTROL VIA .isSelected()
        //  WebElement checkbox2 = driver.findElement(By.id("box2"));
        //  WebElement checkbox2 = driver.findElement(By.name("checkbox2"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[name='checkbox2']"));
        System.out.println("Before click checkbox2.isSelected() = " + checkbox2.isSelected());
        checkbox2.click();
        System.out.println("After click checkbox2.isSelected() = " + checkbox2.isSelected());

 */
        /**  CHECKBOX CONTROL VIA .getAttribute() */
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[name='checkbox2']"));
        System.out.println("Before click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After click checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));

        if (checkbox1.isSelected()) {
            System.out.println("checkbox1 is already selected");
        } else {
            checkbox1.click();
            System.out.println("checkbox1 is selected by Automation");
        }

        if (checkbox2.isSelected()) {
            System.out.println("checkbox1 is already selected");
        } else {
            checkbox2.click();
            System.out.println("checkbox2 is selected by Automation");
        }


        driver.quit();

    }
}
