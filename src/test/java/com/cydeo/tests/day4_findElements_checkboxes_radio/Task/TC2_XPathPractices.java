package com.cydeo.tests.day4_findElements_checkboxes_radio.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_XPathPractices {
    public static void main(String[] args) {
        //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //  3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //      a. “Home” link
        WebElement home1 = driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[@class='nav-item']//a[@class='nav-link']"));
        WebElement home2 = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement home3 = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        WebElement home4 = driver.findElement(By.xpath("/html/body//a"));

        System.out.println("home1 = " + home1.getText());
        System.out.println("home2 = " + home2.getText());
        System.out.println("home3 = " + home3.getText());
        System.out.println("home4 = " + home4.getText());

        //      b. “Forgot password” header
        WebElement forgotPassword1 = driver.findElement(By.xpath("//div//h2"));
        WebElement forgotPassword2 = driver.findElement(By.xpath("//h2"));
        WebElement forgotPassword3 = driver.findElement(By.xpath("//div[@class ='example']"));
        WebElement forgotPassword4 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement forgotPassword5 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        System.out.println("forgotPassword1 = " + forgotPassword1.getText());
        System.out.println("forgotPassword2 = " + forgotPassword2.getText());
        System.out.println("forgotPassword3 = " + forgotPassword3.getText());
        System.out.println("forgotPassword4 = " + forgotPassword4.getText());
        System.out.println("forgotPassword5 = " + forgotPassword5.getText());

        //      c. “E-mail” text
        WebElement email1 = driver.findElement(By.xpath("//div//label[@for='email']"));
        WebElement email2 = driver.findElement(By.xpath("//label[@for='email']"));

        System.out.println("email1 = " + email1.getText());
        System.out.println("email2 = " + email2.getText());

        //      d. E-mail input box
        WebElement emailInputBox1 = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInputBox3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        System.out.println("emailInputBox1 = " + emailInputBox1.getAttribute("name"));
        System.out.println("emailInputBox2 = " + emailInputBox2.getAttribute("name"));
        System.out.println("emailInputBox3 = " + emailInputBox3.getAttribute("name"));

        //      e. “Retrieve password” button
        WebElement retrievePassword1 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        WebElement retrievePassword2 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePassword3 = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement retrievePassword4 = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement retrievePassword5 = driver.findElement(By.xpath("//button/i[.='Retrieve password']"));

        System.out.println("retrievePassword1 = " + retrievePassword1.getText());
        System.out.println("retrievePassword2 = " + retrievePassword2.getText());
        System.out.println("retrievePassword3 = " + retrievePassword3.getText());
        System.out.println("retrievePassword4 = " + retrievePassword4.getText());
        System.out.println("retrievePassword5 = " + retrievePassword5.getText());

        //      f. “Powered by Cydeo text
        WebElement poweredByCydeo1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("poweredByCydeo1 = " + poweredByCydeo1.getText());


        //      g. “Cydeo text
        WebElement cydeo1 = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        WebElement cydeo2 = driver.findElement(By.xpath("//a[@target='_blank']"));

        System.out.println("cydeo1 = " + cydeo1.getText());
        System.out.println("cydeo2 = " + cydeo2.getText());

        //  4. Verify all web elements are displayed.
        System.out.println("home1.isDisplayed() = " + home1.isDisplayed());
        System.out.println("home1.isEnabled() = " + home1.isEnabled());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("forgotPassword1.isEnabled() = " + forgotPassword1.isEnabled());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        System.out.println("email1.isEnabled() = " + email1.isEnabled());
        System.out.println("emailInputBox1.isDisplayed() = " + emailInputBox1.isDisplayed());
        System.out.println("emailInputBox1.isEnabled() = " + emailInputBox1.isEnabled());
        System.out.println("retrievePassword1.isDisplayed() = " + retrievePassword1.isDisplayed());
        System.out.println("retrievePassword1.isEnabled() = " + retrievePassword1.isEnabled());
        System.out.println("poweredByCydeo1.isDisplayed() = " + poweredByCydeo1.isDisplayed());
        System.out.println("poweredByCydeo1.isEnabled() = " + poweredByCydeo1.isEnabled());
        System.out.println("cydeo1.isDisplayed() = " + cydeo1.isDisplayed());
        System.out.println("cydeo1.isEnabled() = " + cydeo1.isEnabled());



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