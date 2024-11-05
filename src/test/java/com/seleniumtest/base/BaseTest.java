package com.seleniumtest.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mantis-prova.base2.com.br");

        // Realizar login
        login();
    }

    public void login() {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("Gabriel _Moreira");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("teste123");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}