package com.cydeo.review.week5;

import com.cydeo.review.base.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Upload extends TestBase {

    @Test
    public void uploadTest(){
        driver.get("http://practice.cybertekschool.com/upload");

        String path = "C:\\Users\\Zulpikar\\IdeaProjects\\EU9SeleniumReview\\src\\test\\java\\utilities\\upload.txt";
        driver.findElement(By.id("file-upload")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();

        String actual = driver.findElement(By.id("uploaded-files")).getText();
        String expexted = "upload.txt";

        Assert.assertEquals(actual, expexted);
    }
}
