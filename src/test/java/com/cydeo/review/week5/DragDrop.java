package com.cydeo.review.week5;

import com.cydeo.review.base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/drag_and_drop_circles");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Thread.sleep(1000);
        actions.dragAndDrop(source,target).perform();
    }
}
