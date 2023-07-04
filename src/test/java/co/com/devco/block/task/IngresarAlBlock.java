package co.com.devco.block.task;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;



public class IngresarAlBlock {
    public static Performable deNotas() {
        return Task.where("{0} Ingresar al block de notas",
                Open.url("https://www.online-notepad.net/es/bloc-de-notas-online")

                );

    }
}
