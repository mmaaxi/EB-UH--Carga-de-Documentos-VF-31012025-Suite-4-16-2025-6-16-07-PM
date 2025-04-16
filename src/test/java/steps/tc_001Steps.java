package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    private WebDriver driver;
    private tc_001Page page;

    @Given("que el usuario selecciona un archivo PDF válido")
    public void selectValidPDF() {
        driver = new ChromeDriver();
        page = new tc_001Page(driver);
        driver.get("http://url-del-aplicativo");
        page.selectPDFFile("ruta/al/archivo/pdf/valido.pdf");
    }

    @When("el usuario hace clic en el botón 'Cargar'")
    public void clickUploadButton() {
        page.clickUploadButton();
    }

    @Then("el documento se carga correctamente en la interfaz")
    public void verifyDocumentUploaded() {
        Assert.assertTrue(page.isUploadSuccessful());
        driver.quit();
    }
}