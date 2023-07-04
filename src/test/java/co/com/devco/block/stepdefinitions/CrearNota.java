package co.com.devco.block.stepdefinitions;

import co.com.devco.block.task.EscribirNota;
import co.com.devco.block.task.IngresarAlBlock;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;



import static co.com.devco.block.user_interface.InteractuarConNotasGuardadas.A_NOTA_GUARDADA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CrearNota {
    @Dado("que un usuario se encuentra en un block de notas")
    public void queUnUsuarioSeEncuentraEnUnBlockDeNotas() {
        OnStage.theActorCalled("usuario").attemptsTo(
                IngresarAlBlock.deNotas()
        );

    }
    @Cuando("crea una nueva {string}")
    public void creaUnaNueva(String menu) {
        theActorInTheSpotlight().attemptsTo(
                EscribirNota.sinFormato(menu)
        );
    }
    @Entonces("puede ver que la nota se creo de manera exitosa")
    public void puedeVerQueLaNotaSeCreoDeManeraExitosa() {
       OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(A_NOTA_GUARDADA).text().isEqualTo("Mi nota sin formato")
        );

    }

}
