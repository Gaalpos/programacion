import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DNITest {

   @Test
   void testCalcularLetra() {
       DNI dni = new DNI();
       char letra = dni.calcularLetra(36223344);
       assertEquals('T', letra);
   }

   @Test
   void testValidar() {
       DNI dni = new DNI();
       boolean resultado = dni.validar("36223344T");
       //assertEquals(true, resultado);
       assertTrue(resultado);
      
       boolean resultado2 = dni.validar("angel");
       //assertEquals(false, resultado2);
       assertFalse(resultado2);
   }

}