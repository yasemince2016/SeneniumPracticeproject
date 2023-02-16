package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatorElementCheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/checkboxes");
        //check checkbox 1
        WebElement checkbox1= driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("Before check checkbox1 = " + checkbox1.isSelected());
        checkbox1.click();

        System.out.println("After check checkbox1 = " + checkbox1.isSelected());
        WebElement checkbox2 =driver.findElement(By.xpath("//input[@id='box2']"));
        checkbox2.click();
        System.out.println("Before check checkbox2 = " + checkbox2.isSelected());
        checkbox2.click();
        System.out.println("After check checkbox2 = " + checkbox2.isSelected());
        driver.quit();
        // if we want to check the checkbox

        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is already selected");
        }else {
            checkbox1.click();
        }


    }
}
