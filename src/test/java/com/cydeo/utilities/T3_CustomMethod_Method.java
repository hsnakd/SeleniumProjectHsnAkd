package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_CustomMethod_Method {

    public WebDriver driver;


    //We use the utility method we created.

    public static void getTableGetEmail(WebDriver driver, String tableNum, String firstName){
        WebElement eMail = driver.findElement(By.xpath("//table[@id='table" + tableNum +"']//tbody//tr//td[.='" + firstName +"']//following-sibling::td[1]"));
        System.out.println(firstName + "'s email = " + eMail.getText());

    }

}
/*

            TC #3: Create a custom method
                1- Open a Chrome browser
                2- Go to: https://practice.cydeo.com/tables
                3- Write custom method:

                • Method name: getTableGetEmail()
                • Return type: void
                • Arg1: WebDriver driver
                • Arg2: String tableNum
                • Arg3: String firstName

 */