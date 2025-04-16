package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC_007Page;

public class TC_007Steps {
    TC_007Page page = new TC_007Page();

    @Given("I have uploaded a valid PDF document with metadata")
    public void uploadPDFDocument() {
        page.uploadPDF("path/to/valid/pdf_with_metadata.pdf");
    }

    @When("the system extracts and stores the associated metadata")
    public void extractAndStoreMetadata() {
        boolean isMetadataExtracted = page.checkMetadataExtraction();
        Assert.assertTrue("Metadata should be extracted", isMetadataExtracted);
    }

    @Then("the metadata is correctly associated in the database")
    public void verifyMetadataInDatabase() {
        boolean isMetadataInDatabase = page.verifyMetadataInDatabase();
        Assert.assertTrue("Metadata should be correctly associated in database", isMetadataInDatabase);
    }

    @Then("the metadata is displayed correctly in the admin interface")
    public void verifyMetadataInAdminInterface() {
        boolean isMetadataDisplayed = page.checkMetadataInAdminInterface();
        Assert.assertTrue("Metadata should be displayed in admin interface", isMetadataDisplayed);
    }
}