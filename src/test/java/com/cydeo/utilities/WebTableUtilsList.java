package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtilsList {

    public static String listOfTable(WebDriver driver, String customerName, String information){
        int cell=0;

        if (information.equalsIgnoreCase("name")) {
             cell = 0;
        }else if (information.equalsIgnoreCase("pizza type")) {
             cell = 1;
        }else if (information.equalsIgnoreCase("amount")) {
             cell = 2;
        }else if (information.equalsIgnoreCase("date")) {
             cell = 3;
        }else if (information.equalsIgnoreCase("strett")) {
             cell = 4;
        }else if (information.equalsIgnoreCase("city")) {
             cell = 5;
        }else if (information.equalsIgnoreCase("state")) {
             cell = 6;
        }else if (information.equalsIgnoreCase("zip")) {
             cell = 7;
        }else if (information.equalsIgnoreCase("card")) {
             cell = 8;
        }else if (information.equalsIgnoreCase("card number")) {
             cell = 9;
        }else if (information.equalsIgnoreCase("exp")) {
             cell = 10;
        }

       String locator = "//td[.='"+customerName+"']/following-sibling::td["+ cell +"]";
       WebElement customerDateCell = driver.findElement(By.xpath(locator));
       return customerDateCell.getText();
    }



}
