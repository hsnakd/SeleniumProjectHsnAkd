package com.cydeo.review.avengerHours.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement flash = driver.findElement(By.id("flash-messages"));
        System.out.println(flash.getTagName());

        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println(meta.getTagName());

        WebElement className = driver.findElement(By.className("row"));
        System.out.println(className.getTagName());

        WebElement tagName = driver.findElement(By.tagName("style"));
        System.out.println(tagName.getTagName());

        WebElement link1 = driver.findElement(By.linkText("Challenging DOM"));
        System.out.println(link1.getTagName());

        WebElement link2 = driver.findElement(By.partialLinkText("Mailing"));
        System.out.println(link2.getText());

        WebElement link3 = driver.findElement(By.partialLinkText("File"));
        System.out.println(link3.getText());
    }
}
