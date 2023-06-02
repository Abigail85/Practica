package co.com.devco.block.stepdefinitions;


import co.com.devco.block.task.EscribirNota;
import co.com.devco.block.task.IngresarAlBlock;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.block.user_interface.NotaTextoEnriquecidoHomePage.S_MENSAJE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CreaNotaStepDefinitions {

    @Dado("que un {actor} ingresa a {string}")
    public void queIngresaA(Actor actor,String menu) {
       actor.attemptsTo(IngresarAlBlock.deNotas(menu));

    }
    @Cuando("crea la nota {string} en negrita")
    public void creaLaNotaEnNegrita(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                EscribirNota.enNegrita(mensaje)
        );

    }
    @Entonces("debe ver como resultado su nota en negrita")
    public void debeVerComoResultadoSuNotaEn() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(S_MENSAJE).isDisplayed()
        );


    }



}
