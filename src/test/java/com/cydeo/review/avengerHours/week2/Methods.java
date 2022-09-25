package com.cydeo.review.avengerHours.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

//        WebElement link1 = driver.findElement(By.xpath("//a[.=\"Add/Remove Elements\"]"));

//        List<WebElement> links = driver.findElements(By.xpath("//a"));

//        WebElement wrongLink = driver.findElement(By.xpath("//hhhhhh"));

//        List<WebElement> wrongLinks = driver.findElements(By.xpath("//fffffff"));
//        System.out.println(wrongLinks);


//        link1.click();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement textInput = driver.findElement(By.name("email"));
//        textInput.sendKeys("abc@abc.com" + Keys.ENTER);

//        System.out.println(driver.findElement(By.xpath("//label")).getText());
        System.out.println(driver.findElement(By.xpath("//label")).getAttribute("for"));


    }
}
