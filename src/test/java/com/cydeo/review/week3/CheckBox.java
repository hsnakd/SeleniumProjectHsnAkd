package com.cydeo.review.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cydeo.review.utilities.*;

import java.util.List;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/checkboxes");

        List<WebElement> labels = driver.findElements(By.className("checktext"));
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

////        for (WebElement label : labels) {
////            System.out.println(label.getText());
//        }

        for (WebElement box : boxes) {
            System.out.println(box.isSelected());
        }
    }
}
