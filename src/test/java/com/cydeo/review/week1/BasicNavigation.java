package com.cydeo.review.week1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        driver.get("https://cydeo.com/?mn=LLQh7YuqfCzrHCXtM5RzPvq6nLS1peGXW9om.U6_Kkd-I28dKe33K");

        driver.navigate().back(); // go back to google

        driver.navigate().forward(); // go forward to cydeo

        driver.navigate().refresh(); // refresh cydeo page

        driver.navigate().to("https://www.yahoo.com/");
        Thread.sleep(5000);

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        // go to yahoo and validate title is "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos"

//        if(title.equals("Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos") ){
//            System.out.println("User is on the correct page, test passed");
//        }else {
//            System.out.println("User is on the wrong page, test failed");
//        }

        if(url.equals("https://www.yahoo.com/")){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test failed");
        }

        driver.close();



    }


}
