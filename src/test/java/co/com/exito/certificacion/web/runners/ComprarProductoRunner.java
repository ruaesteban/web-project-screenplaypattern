package co.com.exito.certificacion.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/comprar_producto.feature",
        glue = {"co.com.exito.certificacion.web.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ComprarProductoRunner {
}
