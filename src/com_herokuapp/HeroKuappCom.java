package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HeroKuappCom {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();      //Object declaration for Chrome web page
        driver.get(baseUrl);           //Load the webpage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Give implicit time
        driver.manage().window().maximize();        // Maximize the browser window
        System.out.println(driver.getTitle());              // print the title of this web page
        System.out.println(driver.getCurrentUrl());         // Print the Current URL
        System.out.println(driver.getPageSource());         // Print the Page source code file
        driver.findElement(By.id("username")).sendKeys("Kaushik");    // Enter the username in the usename field
        driver.findElement(By.id("password")).sendKeys("12345678");     // Enter the Password in the Password field.
        driver.close();     // Closing the Browser
    }
}
