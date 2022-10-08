package com.tasks;

import com.cydeo.pages.EvrekaPage;
import com.cydeo.pages.N11Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class n11Task {

    @Test
    public void task7_scroll_test(){
        N11Page n11Page = new N11Page();
//        1-	www.n11.com sitesi açılır. https://www.n11.com/

        Driver.getDriver().get("https://www.n11.com/");

        n11Page.rejectCookies.click();

//        2-	Ana sayfanın açıldığı kontrol edilir.


//        3.    Siteye login olunur

        n11Page.siginButton.click();

        n11Page.username.sendKeys("newlifebandirma@gmail.com");
        n11Page.password.sendKeys("NLSM01092018..");
        BrowserUtils.sleep(2);

        n11Page.loginButton.click();

//        4-	Login işlemi kontrol edilir.


//        5. Iphone kelimesi aranır.
        n11Page.searchBox.sendKeys("Iphone" + Keys.ENTER);


//        6. Arama sonuçları sayfasından 2. sayfa açılır.


//        8.  Sayfadaki 3. ürün favorilere eklenir.
        n11Page.thirdProductFavorite.click();


//        10-	Hesabım -> İstek Listem / Favorilerim sayfasına gidilir.
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);

        actions.moveToElement(n11Page.account).perform();
        BrowserUtils.sleep(2);

        n11Page.accountFL.click();

//        11-	“Favorilerim” sayfası açıldığı kontrol edilir.
        String expectedTitle = "Favorilerim / Listelerim";
        String actualTitle = n11Page.favoriteList.getText();
        Assert.assertEquals(expectedTitle, actualTitle);

//        12-	Eklenen ürün favorilerden silinir ve silme işlemi kontrol edilir.
        n11Page.favorite.click();
        n11Page.delete.click();

        String expectedDeleteMessage = "Ürününüz listeden silindi.";
        String actualDeleteMessage = n11Page.deleteMessage.getText();
        Assert.assertEquals(expectedDeleteMessage, actualDeleteMessage);

        n11Page.okButton.click();



//        13-	Üye çıkış işlemi yapılır.

        actions.moveToElement(n11Page.account).perform();
        BrowserUtils.sleep(2);

        n11Page.logoutButton.click();


    }
}
