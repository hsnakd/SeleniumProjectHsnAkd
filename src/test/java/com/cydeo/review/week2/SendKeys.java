package com.cydeo.review.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://practice.cydeo.com/inputs");
//
//        WebElement input = driver.findElement(By.xpath("//input[@type=\"number\"]"));
//        input.sendKeys("100");

        driver.get("https://practice.cydeo.com/login");

        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));

        System.out.println(username.getAttribute("type"));


        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword" + Keys.ENTER);

    }
}
