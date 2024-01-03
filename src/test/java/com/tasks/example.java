package com.tasks;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class example {

    @Test
    public void example() throws InterruptedException {
        //1. Goto
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://library1.cydeo.com/login.html");

        Driver.getDriver().findElement(By.id("inputEmail")).sendKeys("librarian1@library");
        Driver.getDriver().findElement(By.id("inputPassword")).sendKeys("rs4BNN9G");
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        WebElement aN = Driver.getDriver().findElement(By.xpath("//a[@id='navbarDropdown']/span"));




        System.out.println("aN.getText() = " + aN.getText());


        String expectedResult = "Test Librarian 1";
        String actualResult = aN.getText();


    }

}
