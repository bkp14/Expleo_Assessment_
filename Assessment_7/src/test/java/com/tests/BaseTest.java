package com.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static ThreadLocal<WebDriver> driver1 = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    }
    public static WebDriver getDriver() {
        return driver1.get();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}