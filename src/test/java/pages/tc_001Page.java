package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    private WebDriver driver;
    private By fileInput = By.id("file-upload");
    private By uploadButton = By.id("upload-button");
    private By successMessage = By.id("upload-success");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPDFFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public void clickUploadButton() {
        WebElement uploadButtonElement = driver.findElement(uploadButton);
        uploadButtonElement.click();
    }

    public boolean isUploadSuccessful() {
        WebElement successMessageElement = driver.findElement(successMessage);
        return successMessageElement.isDisplayed();
    }
}