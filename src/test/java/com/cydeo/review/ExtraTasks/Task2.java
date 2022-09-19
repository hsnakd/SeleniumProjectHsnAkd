package com.cydeo.review.ExtraTasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task2 {

    @Test
    public void test2(){

        SmartBearUtil util = new SmartBearUtil();
        util.login("chrome");

        WebDriver driver = util.driver;


//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
//        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
//        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
//
//        userName.sendKeys("Tester");
//        password.sendKeys("test");
//        loginBtn.click();

        driver.findElement(By.xpath("//a[.=\"Order\"]")).click();
        WebElement product = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(product);
        select.selectByIndex(1);
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("2");
        WebElement calculateBtn = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
        calculateBtn.click();

        Faker faker = new Faker();

        String name = faker.name().firstName();
        String street = faker.address().streetAddress();
        String city = faker.address().cityName();
        String state = faker.address().state();
        String zip = faker.address().zipCode();
        String credit = faker.finance().creditCard();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(credit);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("03/21");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();







    }
}
