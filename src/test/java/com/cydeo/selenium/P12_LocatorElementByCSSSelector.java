package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocatorElementByCSSSelector {
    public static void main(String[] args) {
        //Set up chrome and create WebDriver  instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to google page
        driver.get("https://google.com");
        //search for cydeo
        //WebElement serchbox =driver.findElement(By.name("q"));
       // serchbox.sendKeys("cydeo"+ Keys.ENTER);
        WebElement seachbox=driver.findElement(By.cssSelector("input[name='q']"));
seachbox.sendKeys("cydeo"+ Keys.ENTER);



        //Verify cydeo linkText is appeared in the results
WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));

if(cydeoText.getText().equals("Cydeo")){
    System.out.println("cydeo test is passes");
}else {
    System.out.println("cydeo test is failed");
}
driver.quit();

        //close the browser


    }
}
