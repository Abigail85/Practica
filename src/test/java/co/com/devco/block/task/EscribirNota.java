package co.com.devco.block.task;

;
import co.com.devco.block.interactions.ColocarTitulo;
import co.com.devco.block.interactions.CrearNota;
import co.com.devco.block.interactions.EscogerTipo;
import co.com.devco.block.interactions.GuardarNota;
import co.com.devco.block.utils.Constantes;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;



import static co.com.devco.block.user_interface.CrearNotas.*;



public class EscribirNota {
    public static Performable enNegrita(String menu) {
        return Task.where("escribir la nota en negrita",
                actor -> {
               actor.attemptsTo(EscogerTipo.nota(menu));
               actor.attemptsTo(CrearNota.nueva(Constantes.TEXTO_1,menu));
               actor.attemptsTo(ColocarTitulo.aLaNota(Constantes.TITULO_NOTA_CON_FORMATO));
               //actor.attemptsTo(GuardarNota.enElBlock(menu));


    }
                );

    }
    public static Performable sinFormato(String menu) {
        return Task.where("Escribir la nota sin formato",
                actor -> {
                    actor.attemptsTo(EscogerTipo.nota(menu));
                    actor.attemptsTo(CrearNota.nueva(Constantes.TEXTO_1,menu));
                    actor.attemptsTo(ColocarTitulo.aLaNota(Constantes.TITULO_NOTA_SIN_FORMATO));
                    actor.attemptsTo(GuardarNota.enElBlock(menu));
                    //actor.attemptsTo(BuscarNota.guardada(Constantes.TITULO));

                }
        );

    }
    public static Performable listaDeTareas() {
        return Task.where("Escribir la nota sin formato",
                actor -> {
                    actor.attemptsTo(Click.on(A_CREAR_NOTA_NUEVA));


                }
        );


    }
}
