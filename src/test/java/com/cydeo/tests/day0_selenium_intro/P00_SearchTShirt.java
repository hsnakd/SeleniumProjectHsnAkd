package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P00_SearchTShirt {
    public static void main(String[] args) {


        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to website https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");

        WebElement popUpX = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        popUpX.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
        searchBox.sendKeys("t-shirts" + Keys.ENTER);




        //10. quit
        //driver.quit();
    }


}
