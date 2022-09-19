package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import com.cydeo.utilities.StringUtility;
public class P00_NavigationTests {
    public static void main(String[] args) {


        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to website https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
        String titleGoggle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title in a string variable
        String titleETSY = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String titleGoggle2 = driver.getTitle();

        StringUtility.verifyEquals(titleGoggle,titleGoggle2);

/*
        if (titleGoggle.equals(titleGoggle2)) {
            System.out.println("Google PASSED");
        } else {
            System.out.println("Google PASSED");
        }
 */
        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String titleETSY2 = driver.getTitle();

        StringUtility.verifyEquals(titleETSY,titleETSY2);
/*
        if (titleETSY.equals(titleETSY2)) {
            System.out.println("ETSY PASSED");
        } else {
            System.out.println("ETSY PASSED");
        }
 */

        //10. quit
        driver.quit();
    }


}
