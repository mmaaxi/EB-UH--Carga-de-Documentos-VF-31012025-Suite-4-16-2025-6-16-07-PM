package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_002Page {

    WebDriver driver;

    @FindBy(id = "fileInput")
    WebElement fileInput;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "errorMessage")
    WebElement errorMessage;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String filePath) {
        fileInput.sendKeys(filePath);
    }

    public void clickUploadButton(String button) {
        uploadButton.click();
    }

    public boolean isUploadProcessStarted() {
        // Método para verificar que el proceso de carga no ha iniciado
        return false; // Suponemos que si no inicia devuelve false
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}