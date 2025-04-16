package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    By errorMessageLocator = By.id("error-message");
    By retryButtonLocator = By.id("retry-button");
    By successMessageLocator = By.id("success-message");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simulateNetworkFailure() {
        // Simulate network failure - this could be achieved by disabling the network using browser tools
        System.out.println("Simulating network failure...");
    }

    public void verifyErrorMessage() {
        WebElement errorMessage = driver.findElement(errorMessageLocator);
        if (errorMessage.isDisplayed() && errorMessage.getText().contains("network error")) {
            System.out.println("Error message is displayed as expected.");
        } else {
            throw new AssertionError("Error message not displayed or incorrect.");
        }
    }

    public void retryLoading() {
        WebElement retryButton = driver.findElement(retryButtonLocator);
        retryButton.click();
    }

    public void verifyRetrySuccess() {
        WebElement successMessage = driver.findElement(successMessageLocator);
        if (successMessage.isDisplayed() && successMessage.getText().contains("loading successful")) {
            System.out.println("Retry successful as expected.");
        } else {
            throw new AssertionError("Retry not successful or message incorrect.");
        }
    }
}