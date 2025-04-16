package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    By uploadInput = By.id("uploadInput");
    By uploadButton = By.id("uploadButton");
    By uploadSuccessMessage = By.id("uploadSuccess");
    By displayedFilename = By.id("filenameDisplay");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        WebElement successMessage = driver.findElement(uploadSuccessMessage);
        return successMessage.isDisplayed();
    }

    public boolean isFilenameDisplayedCorrectly() {
        WebElement filenameElement = driver.findElement(displayedFilename);
        String displayedText = filenameElement.getText();
        return displayedText.length() > 0; // Additional checks can be added for truncation validation
    }
}