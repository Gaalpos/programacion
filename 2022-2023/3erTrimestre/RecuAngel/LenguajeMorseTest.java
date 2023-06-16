import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LenguajeMorseTest {

  @Test
  public void calculaFrecuenciaTest() {
    LenguajeMorse programa = new LenguajeMorse();
    float periodo = 2.4f;
    double frecuencia = programa.calculaFrecuencia(periodo);
    assertEquals(0.416, frecuencia, 0.1);
  }

  @Test
  public void calculaFrecuenciaTestError() {
    LenguajeMorse programa = new LenguajeMorse();
    float periodo = 8.4f;
    double frecuencia = programa.calculaFrecuencia(periodo);
    assertEquals(0.416, frecuencia, 0.1);
  }

  @Test
  public void textoToMorseTest() {
    LenguajeMorse programa = new LenguajeMorse();
    // la cadena dice: Hola soy gabriel
    String ascii2= " hola";
    String morse = programa.textoToMorse(ascii2);
    assertEquals("....---.-...-", morse);
  }

  @Test
  public void textoToMorseTestError() {
    LenguajeMorse programa = new LenguajeMorse();
    // la cadena dice: Hola soy gabriel
    String ascii2= " hola soy gabriel";
    String morse = programa.textoToMorse(ascii2);
    assertEquals("....---.-...-", morse);
  }
}
