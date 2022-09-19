package com.cydeo.review.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        // using css locator
//        WebElement title = driver.findElement(By.cssSelector("div[id=\"flash-messages\"]"));
//        System.out.println(title.getTagName());

        WebElement ul = driver.findElement(By.cssSelector("ul[class='list-group']"));
        System.out.println(ul.getTagName());


    }
}
