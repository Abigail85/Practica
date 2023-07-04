package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.devco.block.user_interface.CrearNotas.INPUT_EDITAR_TITULO;
import static co.com.devco.block.user_interface.CrearNotas.INPUT_TITULO_NOTA;
import static co.com.devco.block.user_interface.GuardarNotas.SPAN_DESCARGAR_NOTA;


public class ColocarTitulo implements Interaction {
    private final Constantes constantes;

    public ColocarTitulo(Constantes constantes){

        this.constantes=constantes;

    }
    @Step("Coloca el titulo de la nota")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_EDITAR_TITULO));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_TITULO_NOTA));
        actor.attemptsTo(Scroll.to(SPAN_DESCARGAR_NOTA));
    }


    public static ColocarTitulo aLaNota(Constantes constantes){
        return Tasks.instrumented(ColocarTitulo.class,constantes);
    }
}
