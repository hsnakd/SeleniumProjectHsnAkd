package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementsByCSS {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://google.com
        driver.get("https://google.com");

        // Search for Cydeo
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("Cydeo" + Keys.ENTER);


        // verify Cydeo linkText is appeared in the result
        WebElement cydeoText = driver.findElement(By.cssSelector("a[href = 'https://cydeo.com/']>h3"));

        // verify title is "Forgot Password"
        if (cydeoText.getText().equals("Cydeo")) {
            System.out.println("Text is passed");
        } else {
            System.out.println("Text is failed");
        }


        // close browser
        driver.quit();

    }
}
