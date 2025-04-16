package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    private WebDriver driver;
    private By uploadInput = By.id("uploadInput");
    private By cancelButton = By.id("cancelButton");
    private By uploadProgress = By.id("uploadProgress");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("url/de/la/pagina/de/carga");
    }

    public void startPdfUpload(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isUploadInProgress() {
        WebElement progressElement = driver.findElement(uploadProgress);
        return progressElement.isDisplayed();
    }

    public void cancelUpload() {
        WebElement cancelBtn = driver.findElement(cancelButton);
        cancelBtn.click();
    }

    public boolean isUploadCancelled() {
        WebElement progressElement = driver.findElement(uploadProgress);
        return !progressElement.isDisplayed();
    }
}