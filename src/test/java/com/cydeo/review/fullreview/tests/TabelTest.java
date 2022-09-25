package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabelTest extends TestBase{

    @Test
    public void webTabel(){
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        String expectedData = "Germany";
        WebElement actual = driver.findElement(By.xpath("//td[.=\"Google\"]/following-sibling::td[2]"));
        Assert.assertEquals(actual.getText(),expectedData);
    }
}
