package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page page;

    @Given("^el usuario navega a la página de carga de archivos$")
    public void el_usuario_navega_a_la_pagina_de_carga_de_archivos() {
        // Inicializa WebDriver y navega a la URL de la página de carga
        driver = // Inicialización del WebDriver (Ej: new ChromeDriver())
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
        page = PageFactory.initElements(driver, tc_002Page.class);
    }

    @When("^el usuario selecciona un archivo con formato .docx$")
    public void el_usuario_selecciona_un_archivo_con_formato_docx() {
        page.selectFile("ruta/del/archivo/archivo_no_soportado.docx");
    }

    @And("^el usuario hace clic en el botón \"([^\"]*)\"$")
    public void el_usuario_hace_clic_en_el_boton_cargar(String boton) {
        page.clickUploadButton(boton);
    }

    @Then("^el sistema debe rechazar el archivo$")
    public void el_sistema_debe_rechazar_el_archivo() {
        assertFalse(page.isUploadProcessStarted());
    }

    @And("^el sistema muestra un mensaje de error indicando formato no soportado$")
    public void el_sistema_muestra_un_mensaje_de_error() {
        assertEquals("Formato de archivo no soportado", page.getErrorMessage());
        driver.quit();
    }
}