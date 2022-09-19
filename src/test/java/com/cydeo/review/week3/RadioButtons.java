package com.cydeo.review.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cydeo.review.utilities.*;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/radio_buttons");
        List<WebElement> btns = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        for (WebElement btn : btns) {
            System.out.println(btn.getText());
            btn.click();
//            Thread.sleep(1000);
        }

        WebElement label = driver.findElement(By.xpath("//label"));
        System.out.println(label.getText());

        //
    }
}
