package co.com.devco.block.task;

import co.com.devco.block.interactions.BuscarNota;
import co.com.devco.block.interactions.ColocarTitulo;
import co.com.devco.block.interactions.CrearNota;
import co.com.devco.block.interactions.EscogerTipo;
import co.com.devco.block.interactions.GuardarNota;
import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;



import static co.com.devco.block.user_interface.CrearNotas.*;
import static co.com.devco.block.user_interface.CrearNotasConFormato.BUTTON_NEGRITA;


public class EscribirNota {
    public static Performable enNegrita(String menu, String mensaje) {
        return Task.where("escribir la nota en negrita",
                actor -> {
                actor.attemptsTo(EscogerTipo.nota(menu));
                actor.attemptsTo(Click.on(BUTTON_NEGRITA));
                actor.attemptsTo(Enter.theValue(mensaje).into(P_TEXTO));
                actor.attemptsTo(GuardarNota.enElBlock(menu));


    }
                );

    }
    public static Performable sinFormato(String menu) {
        return Task.where("Escribir la nota sin formato",
                actor -> {
                    actor.attemptsTo(EscogerTipo.nota(menu));
                    actor.attemptsTo(CrearNota.nueva(Constantes.TEXTO_1));
                    actor.attemptsTo(ColocarTitulo.aLaNota(Constantes.TITULO));
                    actor.attemptsTo(GuardarNota.enElBlock(menu));
                    actor.attemptsTo(BuscarNota.guardada(Constantes.TITULO));

                }
        );

    }
    public static Performable listaDeTareas(String menu) {
        return Task.where("Escribir la nota sin formato",
                actor -> {
                    actor.attemptsTo(EscogerTipo.nota(menu));
                    actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));


                }
        );


    }
}
