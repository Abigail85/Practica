package co.com.devco.block.stepdefinitions;


import co.com.devco.block.task.EscribirNota;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.devco.block.user_interface.CrearNotasConFormato.S_MENSAJE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CreaNotaConFormatoStepDefinitions {


    @Cuando("Crea una nueva nota en negrita en la opcion {string}")
    public void creaUnaNuevaNotaEnLaOpcion(String menu) {
        theActorInTheSpotlight().attemptsTo(
                EscribirNota.enNegrita(menu)
        );

    }
    @Entonces("debe ver como resultado su nota en negrita")
    public void debeVerComoResultadoSuNotaEn() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(S_MENSAJE).isDisplayed()
        );

    }



}
