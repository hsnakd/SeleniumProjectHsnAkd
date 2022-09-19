package com.cydeo.selenium;

import com.cydeo.base.TestBase_ShortVideo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class P10_WebTables_Practice extends TestBase_ShortVideo {
    @Test
    public void webTablesTest() {
        driver.get("https://practice.cydeo.com/tables");

       // print out  Jason from row and cell number
        WebElement row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking First Name row3Cell2.getText() = " + row3Cell2.getText());

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After clicking First Name row3Cell2.getText() = " + row3Cell2.getText());

        // printout the Jason from text
        WebElement jasonCell = driver.findElement(By.xpath("//table[@id='table1']//tbody//td[.='Jason']"));
        System.out.println("jasonCell = " + jasonCell.getText());

        // printout all cell in a row 3
        List<WebElement> allRow3Cells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));

        for (WebElement eachCell : allRow3Cells) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }
    }
}
/*

------------------------------------------------------------------------------------

P1_ WRITE A LOCATOR THAT RETURNS THE TABLE 1 ITSELF

    //table[@id='table1']


P2_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF TABLE 1

    //table[@id='table1']//tr

P3_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF BODY - TABLE 1

    //table[@id='table1']/tbody//tr


P4_ WRITE A LOCATOR THAT RETURNS ONLY 3RD ROW IN THE BODY

    //table[@id='table1']/tbody//tr[3]

P5_ WRITE A LOCATOR THAT RETURNS ALL OF THE CELLS IN ALL OF THE ROW (IN BODY)

    //table[@id='table1']/tbody//tr//td

    //table[@id='table1']//tr//td -> if there is no <td> in <thead> we can use this too

P6_ WRITE A LOCATOR THAT RETURNS ALL OF THE FIRST NAMES FROM TABLE

    //table[@id='table1']/tbody//tr//td[2]

P7_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY

    //table[@id='table1']/tbody//tr[2]//td[2]

    We are saying:

    //tr[2] : get me the second row in the <tbody>
    //td[2] : get me the second cell in the 2nd row.

P8_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
    USE FRANKS TEXT

    //table[@id='table1']//td[.='Frank']

    - If you can create locators with text, it will be more dependent against the dynamism of the table


P9_ WRITE A LOCATOR THAT RETURNS $100 CELL SPECIFICALLY
    USE FRANKS TEXT


    //table[@id='table1']/tbody//tr[3]//td[4]

    //table[@id='table1']//td[.='$100.00']


P10_ WRITE A LOCATOR THAT RETURNS JASONS DUE AMOUNT BASED ON JASONS NAME


1- We can locate Jason, go to parent row, and come back in the same row to get "Due" cell
    //table[@id='table1']//tbody//td[.='Jason']/../td[4]

2- We can use the sibling method from xpath
    //table[@id='table1']//tbody//td[.='Tim']/following-sibling::td[2]

P11_ WRITE A LOCATOR THAT RETURNS Tim's last name  BASED ON tim's NAME

    //table[@id='table1']/tbody//td[.='Tim']/../td[1]

    //table[@id='table1']/tbody//td[.='Tim']/preceding-sibling::td


P12_ WRITE A LOCATOR THAT RETURNS ALL EMAILS THAT HAS $50 DUE DATE

    //table[@id='table1']/tbody//td[.='$50.00']/preceding-sibling::td[1]


--------------------------------------------------------------------------------


 */