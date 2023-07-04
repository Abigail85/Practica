package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.block.user_interface.InteractuarConNotasGuardadas.INPUT_BUSCAR_NOTA;


public class BuscarNota implements Interaction {
    private final Constantes constantes;


    public BuscarNota(Constantes constantes){
        this.constantes=constantes;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(INPUT_BUSCAR_NOTA));
        actor.attemptsTo(Click.on(INPUT_BUSCAR_NOTA));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_BUSCAR_NOTA));


    }

    public static BuscarNota guardada(Constantes constantes){
        return Tasks.instrumented(BuscarNota.class,constantes);
    }
}
