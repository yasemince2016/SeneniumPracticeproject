package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorsPractice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //Navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");
        //Enter username provided: "abcd"
        WebElement nameText = driver.findElement(By.id("prependedInput"));

        nameText.sendKeys("abcd"+ Keys.ENTER);
        // Enter Password provided : "abcd"

        WebElement paswordText= driver.findElement(By.id("prependedInput2"));
        paswordText.sendKeys("abcd"+Keys.ENTER);
        //Click on Login button
        WebElement loginbutton= driver.findElement(By.name("_submit"));
        loginbutton.click();

        //Verify the message "Invalid user name or password."
        WebElement message= driver.findElement(By.className("alert"));
        if (message.getText().equals("Invalid user name or password.")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        //Verify URL contains "vytrack"
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains("vtrack")){
            System.out.println("URL passed");
        }else {
            System.out.println("URL Failed");
        }

        //click "Forgot your password?" link
        driver.findElement(By.partialLinkText("Forgot")).click();
        //Verify title is "Forgot Password"
      if(driver.getTitle().equals("Forgot Password")){
          System.out.println("Title is correct");
      }else {
          System.out.println("Title is not correct");
      }

    }
}
