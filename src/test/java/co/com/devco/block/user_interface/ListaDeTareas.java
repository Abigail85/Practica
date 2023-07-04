package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaDeTareas {
	public static final Target INPUT_CREAR_TAREAS = Target.the("espacio para crea la nota").located(By.id("my-list"));
	public static final Target INPUT_ADICIONAR_TAREAS = Target.the("espacio poner la negrita").located(By.id("addnewlist"));
	public static final Target DIV_TAREA = Target.the("mover la tarea").locatedBy("//div[@id='sortable']/div['{0}']");
	public static final Target DIV_LISTA_DE_TAREAS = Target.the("lista de tareas").located(By.xpath("//div[@id='tasklist']//div[@class='d-flex justify-content-between delete']"));


}
