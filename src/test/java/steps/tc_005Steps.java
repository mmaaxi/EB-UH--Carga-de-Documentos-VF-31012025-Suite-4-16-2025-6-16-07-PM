package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_005Page;
import static org.junit.Assert.*;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    @Given("que he iniciado sesión en la aplicación")
    public void que_he_iniciado_sesion_en_la_aplicacion() {
        driver = new ChromeDriver();
        page = new tc_005Page(driver);
        page.navigateToLoginPage();
        page.login("usuario", "contraseña");
    }

    @When("inicio la carga de un documento PDF válido")
    public void inicio_la_carga_de_un_documento_pdf_valido() {
        page.startPDFUpload("ruta/del/documento.pdf");
    }

    @When("interrumpo la conexión a internet durante la carga")
    public void interrumpo_la_conexion_a_internet_durante_la_carga() {
        page.interruptInternetConnection();
    }

    @Then("el sistema debe detectar la interrupción")
    public void el_sistema_debe_detectar_la_interrupcion() {
        assertTrue(page.isInterruptionDetected());
    }

    @Then("cancelar la carga con un mensaje de error")
    public void cancelar_la_carga_con_un_mensaje_de_error() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}