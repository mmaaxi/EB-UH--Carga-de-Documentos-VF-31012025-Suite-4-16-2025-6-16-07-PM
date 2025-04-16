package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_004Page;

import static org.junit.Assert.assertTrue;

public class tc_004Steps {
    WebDriver driver = new ChromeDriver();
    tc_004Page uploadPage = new tc_004Page(driver);

    @Given("I navigate to the document upload page")
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    @When("I select a PDF file with an extremely long filename")
    public void selectPDFWithLongFilename() {
        uploadPage.uploadFile("C:/path/to/your/very-long-filename-document.pdf");
    }

    @Then("the system should accept the filename and proceed with the upload")
    public void systemAcceptsFilename() {
        assertTrue(uploadPage.isUploadSuccessful());
    }

    @Then("the interface should display the filename correctly or truncate it appropriately")
    public void interfaceDisplaysFilename() {
        assertTrue(uploadPage.isFilenameDisplayedCorrectly());
    }
}