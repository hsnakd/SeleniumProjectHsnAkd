package com.cydeo.tests.day4_findElements_checkboxes_radio.Task;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_cssSelectorPractices {
    public static void main(String[] args) {
        //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //  3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //      a. “Home” link
        WebElement home1 = driver.findElement(By.cssSelector("nav>ul>li>a[class='nav-link']"));
        WebElement home2 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement home3 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement home4 = driver.findElement(By.cssSelector("a[href='/']"));

        System.out.println("home1 = " + home1.getText());
        System.out.println("home2 = " + home2.getText());
        System.out.println("home3 = " + home3.getText());
        System.out.println("home4 = " + home4.getText());

        //      b. “Forgot password” header
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example > h2"));
        WebElement forgotPassword3 = driver.findElement(By.cssSelector("h2"));

        System.out.println("forgotPassword1 = " + forgotPassword1.getText());
        System.out.println("forgotPassword2 = " + forgotPassword2.getText());
        System.out.println("forgotPassword3 = " + forgotPassword3.getText());

        //      c. “E-mail” text
        WebElement email1 = driver.findElement(By.cssSelector("div>label[for='email']"));
        WebElement email2 = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement email3 = driver.findElement(By.cssSelector("div.large-6"));

        System.out.println("email1 = " + email1.getText());
        System.out.println("email2 = " + email2.getText());
        System.out.println("email3 = " + email3.getText());

        //      d. E-mail input box
        WebElement emailInputBox1 = driver.findElement(By.cssSelector("div > input[name='email']"));
        WebElement emailInputBox2 = driver.findElement(By.cssSelector("input[name='email']"));

        System.out.println("emailInputBox1 = " + emailInputBox1.getAttribute("name"));
        System.out.println("emailInputBox2 = " + emailInputBox2.getAttribute("name"));

        //      e. “Retrieve password” button
        WebElement retrievePassword1 = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button.radius"));
        WebElement retrievePassword3 = driver.findElement(By.cssSelector("i.icon-2x"));

        System.out.println("retrievePassword1 = " + retrievePassword1.getText());
        System.out.println("retrievePassword2 = " + retrievePassword2.getText());
        System.out.println("retrievePassword3 = " + retrievePassword3.getText());

        //      f. “Powered by Cydeo text
        WebElement poweredByCydeo1 = driver.findElement(By.cssSelector("div#page-footer"));
        WebElement poweredByCydeo2 = driver.findElement(By.cssSelector("div.large-4"));

        System.out.println("poweredByCydeo1 = " + poweredByCydeo1.getText());
        System.out.println("poweredByCydeo2 = " + poweredByCydeo2.getText());

        //      g. “Cydeo text
        WebElement cydeo1 = driver.findElement(By.cssSelector("div>a[href='https://cydeo.com/']"));
        WebElement cydeo2 = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));

        System.out.println("cydeo1 = " + cydeo1.getText());
        System.out.println("cydeo2 = " + cydeo2.getText());

        //  4. Verify all web elements are displayed.
        System.out.println("home1.isDisplayed() = " + home1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        System.out.println("emailInputBox1.isDisplayed() = " + emailInputBox1.isDisplayed());
        System.out.println("retrievePassword1.isDisplayed() = " + retrievePassword1.isDisplayed());
        System.out.println("poweredByCydeo1.isDisplayed() = " + poweredByCydeo1.isDisplayed());
        System.out.println("cydeo1.isDisplayed() = " + cydeo1.isDisplayed());



        // quit
        driver.quit();
    }
}
/*
        XPATH and CSS Selector PRACTICES
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        TC #1: XPATH and cssSelector Practices
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com/forgot_password
            3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
                a. “Home” link
                b. “Forgot password” header
                c. “E-mail” text
                d. E-mail input box
                e. “Retrieve password” button
                f. “Powered by Cydeo text
            4. Verify all web elements are displayed.

            First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
            Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
 */