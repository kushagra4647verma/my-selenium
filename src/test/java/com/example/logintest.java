package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class logintest {

    @Test
    public void loginTest() throws InterruptedException {

        // Set chromedriver path
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Chromium options
        ChromeOptions options = new ChromeOptions();

        // IMPORTANT for Chromium
        options.setBinary("/usr/bin/chromium-browser");
        
        options.addArguments("--headless");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");

WebDriver driver = new ChromeDriver(options);

        // Open browser
        WebDriver driver = new ChromeDriver(options);

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Maximize
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button"))
              .click();

        // Wait 5 seconds
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
