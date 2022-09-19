package com.cydeo.review.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void test1() {
        driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            System.out.println(driver.switchTo().window(handle).getTitle());
        }
    }
}
