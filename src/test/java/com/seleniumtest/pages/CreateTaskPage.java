package com.seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateTaskPage {
    private WebDriver driver;

    private By createTaskButton = By.cssSelector("a[href='bug_report_page.php']");
    private By categoryDropdown = By.name("category_id");
    private By summaryField = By.name("summary");
    private By descriptionField = By.name("description");
    private By submitButton = By.cssSelector("input[type='submit']");

    public CreateTaskPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCreateTaskForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createTaskLink = wait.until(ExpectedConditions.elementToBeClickable(createTaskButton));
        createTaskLink.click();
    }

    public void enterTaskCategory(String category) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryDropdown));
        Select dropdown = new Select(driver.findElement(categoryDropdown));
        dropdown.selectByVisibleText(category);
    }

    public void enterTaskSummary(String summary) {
        driver.findElement(summaryField).sendKeys(summary);
    }

    public void enterTaskDescription(String description) {
        driver.findElement(descriptionField).sendKeys(description);
    }

    public void submitTask() {
        driver.findElement(submitButton).click();
    }

    public void createTask(String summary, String description, String category) {
        openCreateTaskForm();
        enterTaskCategory(category);
        enterTaskSummary(summary);
        enterTaskDescription(description);
        submitTask();
    }
}