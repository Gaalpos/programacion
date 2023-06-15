import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class OptimizaTest {

  @Test
  public void buscaTest() {
    Optimiza programa = new Optimiza();
    String fruta = "platano";
    boolean esta = programa.busca(fruta);
    assertTrue(fruta, esta);
  }

  @Test
  public void buscaTestNoEsta() {
    Optimiza programa = new Optimiza();
    String fruta = "sandia";
    boolean esta = programa.busca(fruta);
    assertFalse(fruta, esta);
  }

  @Test
  public void cuentaLetrasTest() {
    Optimiza programa = new Optimiza();
    int num = 4;
    int cuantos = programa.cuentaFrutasConMinimoLetras(num);
    assertEquals(6, cuantos);
  }


  @Test 
  public void mediaCaracteres(){
    Optimiza programa = new Optimiza();
    float media = programa.mediaCaracteres();
    assertEquals(5.65, media, 0.1);

  }

    @Test 
  public void mediaCaracteresMal(){
    Optimiza programa = new Optimiza();
    float media = programa.mediaCaracteres();
    assertEquals(8, media, 0.1);
  }
}
