package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocatorElementByXPath {
    public static void main(String[] args) {


        //set up chrome and WebDriver Instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to google.com
        driver.get("https://google.com");
        //search for cydeo
        WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys("Cydeo" + Keys.ENTER);

        //very Cydeo LinkText is appeared in the results
        WebElement cydeolinktext = driver.findElement(By.xpath("//h3[.='Cydeo']"));

        if (cydeolinktext.getText().equals("Cydeo")) {
            System.out.println("Cydeo LinkText appeared");
        } else {
            System.out.println("Cydeo LinkText not appeared");
        }

        //close the browser
        driver.quit();


}}
