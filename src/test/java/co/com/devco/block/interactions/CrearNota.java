package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.block.user_interface.CrearNotas.A_CREAR_NOTA_NUEVA;
import static co.com.devco.block.user_interface.CrearNotas.TEXTAREA_ESCRIBIR_NOTA;


public class CrearNota implements Interaction {
    private final Constantes constantes;



    public CrearNota(Constantes constantes){
        this.constantes=constantes;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));
        actor.attemptsTo(Click.on(TEXTAREA_ESCRIBIR_NOTA));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(TEXTAREA_ESCRIBIR_NOTA));
    }

    public static CrearNota nueva(Constantes constantes){
        return Tasks.instrumented(CrearNota.class, constantes);
    }
}
