package com.seleniumtest.tests;

import com.seleniumtest.base.BaseTest;
import com.seleniumtest.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.btn-sm")));

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='bug_report_page.php']")).isDisplayed(), "Login falhou. Elemento esperado não encontrado.");
    }
}
