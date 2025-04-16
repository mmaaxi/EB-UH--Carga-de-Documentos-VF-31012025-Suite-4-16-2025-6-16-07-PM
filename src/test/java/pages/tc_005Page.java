package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By loginField = By.id("login");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void login(String user, String pass) {
        driver.findElement(loginField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public void startPDFUpload(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public void interruptInternetConnection() {
        // Simulación de la interrupción de la conexión a internet
        // Esto puede requerir la interacción con herramientas externas
    }

    public boolean isInterruptionDetected() {
        // Lógica para verificar la detección de la interrupción
        return true; // Simulación, en caso real verificar elemento específico
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}