package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {

    private WebDriver driver;

    private By fileInput = By.id("file-upload-input");
    private By uploadButton = By.id("upload-button");
    private By errorMessage = By.id("error-message");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCorruptedFile() {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("/path/to/corrupted/file.pdf");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileDamagedDetected() {
        // Implement logic to verify a damaged file is detected
        WebElement uploadState = driver.findElement(By.id("upload-state"));
        return uploadState.getText().contains("File is damaged");
    }

    public boolean isFileUploadInProgress() {
        // Implement logic to check if the file upload is still in progress
        return false; // Assuming halted as default for demonstration
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}