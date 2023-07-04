package co.com.devco.block.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.block.user_interface.PaginaPrincipal.BUTTON_ESCOGER_MENU;


public class EscogerTipo implements Interaction {
    private final String menu;



    public EscogerTipo(String menu){
        this.menu=menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ESCOGER_MENU.of(menu)),
                Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato"))
        );
    }

    public static EscogerTipo nota(String menu){
        return Tasks.instrumented(EscogerTipo.class,menu);
    }
}
