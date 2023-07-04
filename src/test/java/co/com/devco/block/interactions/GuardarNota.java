package co.com.devco.block.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.block.user_interface.GuardarNotas.BUTTON_GUARDAR_LISTA_DE_TAREAS;
import static co.com.devco.block.user_interface.GuardarNotas.BUTTON_GUARDAR_NOTA_CON_FORMATO;
import static co.com.devco.block.user_interface.GuardarNotas.BUTTON_GUARDAR_NOTA_SIN_FORMATO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GuardarNota implements Interaction {

    private final String menu;


    public GuardarNota(String menu){
        this.menu = menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (menu) {
            case "Lista de tareas":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_LISTA_DE_TAREAS));
                break;
            case "Nota de texto sin formato":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_SIN_FORMATO));
                actor.attemptsTo(WaitUntil.the(BUTTON_GUARDAR_NOTA_SIN_FORMATO, isVisible()).forNoMoreThan(30).seconds());
                break;
            case "Notas de texto enriquecido":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_CON_FORMATO));
                break;
            default:
                System.out.println("La nota no fue encontrada");
                break;
        }
    }

    public static GuardarNota enElBlock(String menu){
        return Tasks.instrumented(GuardarNota.class,menu);
    }
}
