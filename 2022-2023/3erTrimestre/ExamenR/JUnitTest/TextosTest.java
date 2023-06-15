import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TextosTest {

    @Test
    public void testPrimerCaracter(){
        Textos programa = new Textos();
        String cadena = "cebem";
        char letra = programa.obtenerPrimerCaracter(cadena);
        assertEquals('c', letra);
    }

    @Test 
    public void testCadenaVacia(){
        Textos programa = new Textos();
        String cadena = "";
        boolean letra = programa.cadenaVacia(cadena);
        assertEquals(true, letra);
    }

     @Test 
    public void testCadenaVaciaFalse(){
        Textos programa = new Textos();
        String cadena = "hh";
        boolean letra = programa.cadenaVacia(cadena);
        assertEquals(false, letra);
    }

    
}
