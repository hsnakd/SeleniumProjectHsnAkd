package com.cydeo.review.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl() {
        driver.get("http://practice.cybertekschool.com/web-tables");

    }

    @Test
    public void getNames() {

        List<WebElement> names = driver.findElements(By.xpath("//tbody//div[@class='content']//td[2]"));
        for (WebElement name : names) {
            System.out.println(name.getText());
        }
    }

    @Test
    public void test2(){

        String date = WebTableUtils.returnOrderDate(driver,"Robert Baratheon");
        System.out.println(date);
    }
}
