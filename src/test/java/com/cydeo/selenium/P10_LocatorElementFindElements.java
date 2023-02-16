package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P10_LocatorElementFindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size = " + allColors.size());
        for (WebElement eachcolor:allColors) {
            System.out.println("Current RadioButton is = " + eachcolor.getAttribute("id"));
            System.out.println("is it enabled = " + eachcolor.isEnabled());
            System.out.println("is it selected = " + eachcolor.isSelected());


        }
        driver.quit();


    }

}
