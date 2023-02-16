package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B05_LocatorElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        //Identfy "I am feeling Lucky" element and save the element

          WebElement lucktText = driver.findElement(By.id("gbqfbb"));
        System.out.println("I am feeling Lucky"+lucktText);

        //find value of attribute
        String text =lucktText.getAttribute("value");


        //verify if value is "I am feeling lucky"
        if (text.equals("I'm Feeling Lucky")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }

    }

    public static class B06_LocateElementByName {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://google.com");
           WebElement searchBox= driver.findElement(By.name("q"));
            searchBox.sendKeys("selenium"+ Keys.ENTER);
    driver.quit();

        }
    }
}
