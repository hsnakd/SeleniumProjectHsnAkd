package com.cydeo.tests.day2_locators_getText_getAttribute.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_Facebook_Task2 {
    public static void main(String[] args) throws InterruptedException {


        // TODO   TC #4: Practice Cydeo – Class locator practice

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://www.facebook.com"
        driver.navigate().to("https://www.facebook.com");

        // 3. Enter incorrect username
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("woodenspoon@cydeo.com");

        // 4. Enter incorrect password
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("cydeo1234");


        // 4,5. Click Login button
        WebElement login = driver.findElement(By.name("login"));
        login.click();

        Thread.sleep(3000);

        // 5. Verify title changed to:
        //    Expected: “Log in to Facebook”
        String expectedTitle = "Log in to Facebook";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("TITLE PASSED");
        } else {
            System.out.println("TITLE FAILED");
        }

        // this will close all of the opened windows
        driver.quit();
    }

}
/**

             TC #2: Facebook incorrect login title verification
                 1. Open Chrome browser
                 2. Go to https://www.facebook.com
                 3. Enter incorrect username
                 4. Enter incorrect password
                 5. Verify title changed to:
                    Expected: “Log into Facebook”

             • Create new class for each task.
             • There are some tips in the 2nd page for whoever needs it.
             • Please try to solve yourself first before moving to the tips.


             TIPS FOR TASK #2:
                 1. Set up driver
                 2. Open browser
                 3. Get webpage: https://www.facebook.com
                 4. Locate the username input box using one of 6 locators we learn, and send random string
                 using .sendKeys() method
                 5. Locate the password input box using one of 6 locators we learn, and send random string
                 using .sendKeys() method and Keys.ENTER
                 6. Get title and store it in new String (actual)
                 7. Create new String for expected
                 8. Verify results with if condition
 */