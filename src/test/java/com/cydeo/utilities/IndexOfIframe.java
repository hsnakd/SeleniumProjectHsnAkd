package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfIframe {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        int iframeSize = driver.findElements(By.tagName("iframe")).size();
        System.out.println("iframeSize = " + iframeSize);

        for(int i=0; i<=iframeSize-1; i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(By.xpath("html/body/a/img")).size();

            System.out.println("iframeNumber = " +  i);
            System.out.println(total);
            driver.switchTo().defaultContent();
        }
    }
}

