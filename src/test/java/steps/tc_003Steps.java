package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page = PageFactory.initElements(driver, tc_003Page.class);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA_DE_DOCUMENTOS");
    }

    @When("el usuario selecciona un archivo que excede el tamaño máximo permitido")
    public void el_usuario_selecciona_un_archivo_que_excede_el_tamaño_maximo_permitido() {
        page.selectFile("RUTA_DEL_ARCHIVO_EXCEDIDO");
    }

    @Then("el sistema identifica que el archivo es demasiado grande")
    public void el_sistema_identifica_que_el_archivo_es_demasiado_grande() {
        assertTrue(page.isFileTooLargeIdentified());
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        page.uploadFile();
    }

    @Then("se muestra un mensaje de error indicando que el archivo excede el tamaño permitido")
    public void se_muestra_un_mensaje_de_error() {
        assertTrue(page.isErrorMessageDisplayed());
    }
}