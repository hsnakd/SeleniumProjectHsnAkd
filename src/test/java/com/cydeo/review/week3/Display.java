package com.cydeo.review.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cydeo.review.utilities.*;

public class Display {


    public static void  main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/dynamic_loading/1");

        WebElement label = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"] /h4"));

        System.out.println(label.isDisplayed()); // get false result

        Driver.getDriver().findElement(By.xpath("//div[@id=\"start\"] /button")).click();

        Thread.sleep(5000);

        WebElement label1 = Driver.getDriver().findElement(By.xpath("//div[@id=\"finish\"] /h4"));

        System.out.println(label1.isDisplayed()); // get true result



    }
}
