package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadTest extends TestBase {

    @Test
    public void upload(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("upload")).sendKeys("C:\\Users\\Zulpikar\\IdeaProjects\\EU9SeleniumReview\\src\\test\\java\\fullreview\\UserStory.txt");
    }
}
