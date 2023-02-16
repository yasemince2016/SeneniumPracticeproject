package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B12_LocateElementClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement googleText = driver.findElement(By.className("gbqfba gbqfba-hvr"));
        if(googleText.getText().equals("I'am Feeling Lucky")){
            System.out.println("Test appears correctly");

        }else {
            System.out.println("Test does not appear correctly");
        }


    }

}
