package steps;

import pages.tc_008Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("a corrupted PDF file is selected")
    public void a_corrupted_pdf_file_is_selected() {
        page.selectCorruptedFile();
    }

    @When("the user attempts to upload the document")
    public void the_user_attempts_to_upload_the_document() {
        page.clickUploadButton();
    }

    @Then("the system detects the file is damaged")
    public void the_system_detects_the_file_is_damaged() {
        Assert.assertTrue(page.isFileDamagedDetected());
    }

    @Then("the upload is halted")
    public void the_upload_is_halted() {
        Assert.assertFalse(page.isFileUploadInProgress());
    }

    @Then("an error message is displayed informing about the damage")
    public void an_error_message_is_displayed_informing_about_the_damage() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}