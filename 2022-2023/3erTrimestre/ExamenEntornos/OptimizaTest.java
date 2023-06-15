import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class OptimizaTest {

  @Test
  void testBusca() {
    Optimiza programa = new Optimiza();
    String fruta = "fresa";
    boolean esta = programa.busca(fruta);
    assertTrue(esta);
  }

  @Test
  void testBuscaNoEsta() {
    Optimiza programa = new Optimiza();
    String fruta = "sanida";
    boolean esta = programa.busca(fruta);
    assertFalse(esta);
  }

  @Test
  void testCuentaFrutasConMinimoLetras() {
    Optimiza programa = new Optimiza();
    int letras = 6;
    int frutas = programa.cuentaFrutasConMinimoLetras(letras);
    assertEquals(3, frutas);
  }

  @Test
  void testCuentaFrutasConMinimoLetrasFalse() {
    Optimiza programa = new Optimiza();
    int letras = 10;
    int frutas = programa.cuentaFrutasConMinimoLetras(letras);
    assertEquals(0, frutas);
  }

  @Test
  void testMediaCaracteres() {
    Optimiza programa = new Optimiza();
    float media = programa.mediaCaracteres();
    assertEquals(5.66, media, 0.1);
  }
}
