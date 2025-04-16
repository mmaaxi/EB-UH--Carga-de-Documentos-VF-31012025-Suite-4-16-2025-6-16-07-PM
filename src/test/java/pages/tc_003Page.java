package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {

    WebDriver driver;

    By fileInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By errorMessage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public boolean isFileTooLargeIdentified() {
        // Assuming the system sets a specific class or attribute if the file is too large
        WebElement fileInputElement = driver.findElement(fileInput);
        return fileInputElement.getAttribute("class").contains("file-too-large");
    }

    public void uploadFile() {
        driver.findElement(uploadButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed() && errorElement.getText().contains("excede el tamaño permitido");
    }
}