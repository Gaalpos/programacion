import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasarMayusculasTest {

    @Test
    public void MayusculasTest(){
    PasarMayusculas programa = new PasarMayusculas();
    String texto = "hola que tal";
    String Mayus = programa.convertirAMayusculas(texto);
    assertEquals("HOLA QUE TAL", Mayus);

    }    
}
