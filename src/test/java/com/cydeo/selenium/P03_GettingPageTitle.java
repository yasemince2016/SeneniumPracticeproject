package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println("Web Page is : "+ title);
        if (title.equals("google")){
            System.out.println("Test Passed");

        }else{
            System.out.println("Test Failed");
        }

        driver.quit();

    }
}
