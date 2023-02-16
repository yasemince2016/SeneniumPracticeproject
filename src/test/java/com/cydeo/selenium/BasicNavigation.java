package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://cydeo.com");
        String title = driver.getTitle();
        System.out.println("Title of the page "+title);
         driver.quit();


        //navigate to(url)
      // driver.navigate().to("https://www.google.com");

        //driver.get(url)
       // driver.get("https://www.google.com");

        //navigate.back()
        driver.navigate().back();

        //navigate.forward()
        driver.navigate().forward();

        //navigate.refresh()
        driver.navigate().refresh();
    }
}
