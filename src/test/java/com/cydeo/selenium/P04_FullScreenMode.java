package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {
    public static void main(String[] args) {
        //set up chrome and Webdrivwr instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Navigate to google and print out the title
        driver.get("https://cydeo.com");
        //driver.manage().window().maximize();

        driver.manage().window().fullscreen();

    }
}
