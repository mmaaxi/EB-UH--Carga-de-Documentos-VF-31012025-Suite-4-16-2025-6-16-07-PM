package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Given("I simulate a network failure during the document loading")
    public void simulateNetworkFailure() {
        page = new tc_010Page(driver);
        page.simulateNetworkFailure();
    }

    @Then("the system captures the error and displays an informational message")
    public void verifyErrorMessageDisplayed() {
        page.verifyErrorMessage();
    }

    @When("I retry the document loading")
    public void retryDocumentLoading() {
        page.retryLoading();
    }

    @Then("the system allows the retry without additional errors")
    public void verifyRetrySuccess() {
        page.verifyRetrySuccess();
    }
}