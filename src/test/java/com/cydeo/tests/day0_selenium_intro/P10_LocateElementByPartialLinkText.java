package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementByPartialLinkText {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://cydeo.com/
        driver.get("http://newlifesporbandirma.com/");

        // identify and save the "We know how it feels because we’ve been there too. The rents due, and your bills are piling up. You’re stuck in a dead-end job with no end in sight. We believe in you and want to help. Together, we can reach your potential." element
        WebElement actualText = driver.findElement(By.partialLinkText("BİZİMLE"));
        // print put text
        System.out.println(actualText.getText());

/*
        String expectedText = "Equip your ambition";

        if (actualText.getText().contains(expectedText)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

 */
        // close browser
        driver.quit();

    }
}
