package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P00_WiredHeadphones {
    public static void main(String[] args) throws InterruptedException {


        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Go to website https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");

        //Close Pop-up
        WebElement popUpX = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        popUpX.click();

        // Move to Electronics ==> Audio ==> Wired Headphones
        Actions a = new Actions(driver);

            a.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba']) [5]"))).perform();
            a.moveToElement(driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"))).perform();

        // Check locate
        String expectedResult = "Wired Headphones";
        WebElement actualResult = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]"));

        if (actualResult.getText().equals(expectedResult)) {
            System.out.println("PASS");
        } else{
            System.out.println("FAIL");
        }
        // Click Wired Headphones
        actualResult.click();

        //Quit
        driver.quit();
    }


}
