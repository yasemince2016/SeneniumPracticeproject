package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_LocatorelementRadioButton {
    public static void main(String[] args) {

        //we setup chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");
        // blue
        WebElement blueRadioButton= driver.findElement(By.xpath("//input[@id='blue']"));
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
         blueRadioButton.click();
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        //Click Red Button
        WebElement redRadioBtn=driver.findElement(By.id("red"));
        System.out.println("before redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        redRadioBtn.click();
        System.out.println("after redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
    }
}
