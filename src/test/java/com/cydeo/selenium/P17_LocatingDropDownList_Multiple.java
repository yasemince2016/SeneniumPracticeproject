package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropDownList_Multiple {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");
        //identify the dropdown witj multiple select option
        WebElement multiItemDrop= driver.findElement(By.name("Languages"));
        //wrap this element into Select object
        Select multiElementSelect =new Select(multiItemDrop);
        //check if this element has multi select option
        System.out.println("multiElementSelect.isMultiple() = " + multiElementSelect.isMultiple());

        //select items
        multiElementSelect.selectByIndex(2);
        multiElementSelect.selectByValue("ruby");
        multiElementSelect.selectByVisibleText("Python");

        //deselect items
        multiElementSelect.deselectByIndex(2);




    }
}
