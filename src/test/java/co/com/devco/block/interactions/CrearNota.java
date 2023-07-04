package co.com.devco.block.interactions;

import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;


import static co.com.devco.block.user_interface.CrearNotas.A_CREAR_NOTA_NUEVA;
import static co.com.devco.block.user_interface.CrearNotas.P_TEXTO;
import static co.com.devco.block.user_interface.CrearNotas.TEXTAREA_ESCRIBIR_NOTA;
import static co.com.devco.block.user_interface.CrearNotasConFormato.BUTTON_NEGRITA;




public class CrearNota implements Interaction {
    private final Constantes constantes;
    private final String menu;



    public CrearNota(Constantes constantes, String menu){
        this.constantes=constantes;
        this.menu=menu;

    }

    @Step("Escribe la nota, segun el formato escogido por el usuario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));
        if (menu.equals("Nota de texto sin formato") ) {
            actor.attemptsTo(Click.on(TEXTAREA_ESCRIBIR_NOTA));
            actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(TEXTAREA_ESCRIBIR_NOTA));
        }else  if(menu.equals("Nota de texto enriquecido")) {
            actor.attemptsTo(Click.on(BUTTON_NEGRITA));
            actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(P_TEXTO));
        }else {
                System.out.println("La nota no fue encontrada");

        }

    }

    public static CrearNota nueva(Constantes constantes,String menu){
        return Tasks.instrumented(CrearNota.class, constantes,menu);
    }
}
