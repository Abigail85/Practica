package co.com.devco.block.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InteractuarConNotasGuardadas {

	public static final Target A_NOTA_GUARDADA = Target.the("espacio para guardar la nota").located(By.xpath("//self::div/child::a[@data-protected='false']"));
	public static final Target INPUT_BUSCAR_NOTA = Target.the("Busqueda de las notas guardadas").located(By.id("noteSearch"));
	public static final Target A_LEER_NOTA_GUARDADA = Target.the("Espacio para leer la nota guardada").located(By.className("paper-content plaintextnote note_editors"));//xpath("//div[@id='plaintextnot']"));//cssSelector("#input"));//xpath("//div[@id=\"plaintextnote\"]//textarea"));
}



