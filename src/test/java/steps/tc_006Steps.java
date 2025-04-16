import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el sistema está preparado para la carga de documentos")
    public void el_sistema_esta_preparado_para_la_carga_de_documentos() {
        page.prepareSystemForDocumentUpload();
    }

    @When("múltiples usuarios intentan cargar documentos simultáneamente")
    public void multiples_usuarios_intentan_cargar_documentos_simultaneamente() {
        page.simulateMultipleUserUploads();
    }
    
    @Then("el sistema mantiene rendimiento aceptable")
    public void el_sistema_mantiene_rendimiento_aceptable() {
        assertTrue(page.isSystemPerformanceAcceptable());
    }
    
    @Then("no se generan bloqueos")
    public void no_se_generan_bloqueos() {
        assertFalse(page.isSystemBlocked());
    }

    @Given("el sistema está bajo carga alta")
    public void el_sistema_esta_bajo_carga_alta() {
        page.setHighLoadCondition();
    }

    @When("se monitorea el tiempo de respuesta")
    public void se_monitorea_el_tiempo_de_respuesta() {
        page.monitorResponseTime();
    }

    @Then("el tiempo de respuesta se mantiene dentro de los límites aceptables")
    public void el_tiempo_de_respuesta_se_mantiene_dentro_de_los_limites_aceptables() {
        assertTrue(page.isResponseTimeAcceptable());
    }
}