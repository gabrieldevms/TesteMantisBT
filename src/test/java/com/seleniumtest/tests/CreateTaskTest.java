package com.seleniumtest.tests;

import com.seleniumtest.base.BaseTest;
import com.seleniumtest.pages.CreateTaskPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateTaskTest extends BaseTest {

    @Test
    public void testCreateTask() {
        CreateTaskPage createTaskPage = new CreateTaskPage(driver);
        createTaskPage.createTask("Título da tarefa", "Descrição detalhada da tarefa", "[Todos os Projetos] nova categoria");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
        System.out.println("Tarefa criada com sucesso!");
    }
}