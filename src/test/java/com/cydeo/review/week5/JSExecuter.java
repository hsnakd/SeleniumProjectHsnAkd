package com.cydeo.review.week5;

import com.cydeo.review.base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cydeo.com/");
        WebElement link = driver.findElement(By.xpath("//a[.=\"Dropdown\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", link);

    }

    @Test
    public void test2(){
        driver.get("http://practice.cydeo.com/dynamic_controls");
        WebElement input = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = "Cydeo EU9";
        js.executeScript("arguments[0].setAttribute('value', '" + text +"')",input);
    }

    // to scroll up  window.scrollBy(0,250)
    // to scroll down window.scrollBy(0,-250)
}
