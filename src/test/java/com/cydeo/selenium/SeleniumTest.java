package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-Setting up web driver manager
        WebDriverManager.chromedriver().setup();
        //2- create instance of chrome driver
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");




    }
}
