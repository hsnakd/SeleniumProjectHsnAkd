package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowTest extends TestBase {

    @Test
    public void window() {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> handels = driver.getWindowHandles();
        for (String handel : handels) {
            System.out.println(driver.switchTo().window(handel).getTitle());
        }
    }
}
