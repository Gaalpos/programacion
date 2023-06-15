import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Realiza correctamente los test unitarios de los métodos:
● getPeriodo
● getAceleracionAngular

No te limites sólo a testear el Happy Path (casos típicos).
Testea alguna situación excepcional, como por ejemplo:
● Longitud del péndulo nula o negativa (el cual se lanzará una excepción)
● Gravedad nula (el cual se lanzará una excepción
 */
public class PenduloTest {

    @Test
    public void periodoTest(){
    Pendulo pendulillo = new Pendulo(9);
    float gravedad = 10f;
    double periodo = pendulillo.getPeriodo(gravedad);
    assertEquals(5.089, periodo, 0.01);
    }
}



