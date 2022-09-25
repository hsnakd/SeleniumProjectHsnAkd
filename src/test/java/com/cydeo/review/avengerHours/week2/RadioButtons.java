package com.cydeo.review.avengerHours.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> buttons = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

        for (WebElement btn : buttons) {
            btn.click();
            Thread.sleep(1000);
        }
    }
}
