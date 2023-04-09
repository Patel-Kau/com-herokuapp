package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserHeroKuapp {
    static String browser = "firefox";

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;
    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
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
