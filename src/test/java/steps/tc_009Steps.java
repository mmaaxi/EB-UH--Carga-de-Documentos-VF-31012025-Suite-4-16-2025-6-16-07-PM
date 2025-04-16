package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;
import static org.junit.Assert.*;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page uploadPage;

    @Given("^que el usuario está en la página de carga de documentos$")
    public void usuario_en_pagina_carga_documentos() {
        // Código para inicializar el WebDriver y navegar a la página
        uploadPage = new tc_009Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("^el usuario inicia la carga de un documento PDF$")
    public void iniciar_carga_documento_pdf() {
        uploadPage.startPdfUpload("ruta/al/documento.pdf");
    }

    @Then("^el proceso de carga se inicia correctamente$")
    public void verificar_inicio_correcto_carga() {
        assertTrue(uploadPage.isUploadInProgress());
    }

    @When("^el usuario hace clic en el botón 'Cancelar' durante el proceso de carga$")
    public void clic_en_cancelar_durante_el_proceso() {
        uploadPage.cancelUpload();
    }

    @Then("^el proceso de carga se detiene y se revierte cualquier cambio parcial$")
    public void verificar_cancelacion_y_reversion() {
        assertTrue(uploadPage.isUploadCancelled());
    }
}