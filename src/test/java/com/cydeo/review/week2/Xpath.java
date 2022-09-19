package com.cydeo.review.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement element1 = driver.findElement(By.xpath("//div[@class=\"hl-image__background\"]"));
        WebElement element2 = driver.findElement(By.xpath("//div[@style=\"opacity: 0;\"]"));

        System.out.println(element2.getTagName());
        System.out.println(element1.getTagName());
    }
}
