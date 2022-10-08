package com.tasks;

import com.cydeo.pages.EvrekaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class evrekaTask {

    @Test
    public void task7_scroll_test(){
        EvrekaPage evrekaPage = new EvrekaPage();
        //1- Open a Chrome browser
        //   Go to: https://www.amazon.com.tr/
        Driver.getDriver().get("https://www.amazon.com.tr/");

        evrekaPage.acceptCookies.click();


//        2. Search iPhone13 512
        String searchKey = ConfigurationReader.getProperty("searchText");
        evrekaPage.searchBox.sendKeys( searchKey + Keys.ENTER);


//        3. Check that the results are listed
//        String expectedResult = searchKey;
//        String actualResult = evrekaPage.searchResult.getText();
//        Assert.assertEquals(expectedResult,actualResult);
//

//        4. Click iPhone13 at the top of the list
        evrekaPage.iPhone13.click();

//        5. Log the following values for each size
        String brand = evrekaPage.brand.getText();
        String model = evrekaPage.model.getText();
        String size  = evrekaPage.size.getText();
        String color = evrekaPage.color.getText();
        String price = evrekaPage.price.getText();
        String stock = evrekaPage.stock.getText();


        System.out.println("Marka : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Stock : " + stock);


//.Size information .Price .Color .Stock status






    }
}
