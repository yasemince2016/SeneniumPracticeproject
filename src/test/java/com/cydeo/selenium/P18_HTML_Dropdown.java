package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_HTML_Dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement dropDownLink = driver.findElement(By.id("dropdownMenuLink"));
        //click open dropdown which has no select tag
        dropDownLink.click();
        //Click item(link) with text Yahoo
        WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
        itemYahoo.click();


        //quit the browser


    }
}
