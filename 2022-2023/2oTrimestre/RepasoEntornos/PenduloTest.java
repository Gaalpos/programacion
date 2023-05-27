import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PenduloTest {
    Pendulo pendulo;
    float GRAVEDAD_TIERRA = 9.81f;
    float GRAVEDAD_LUNA = 1.62f;

    @Test
    public void testGetPeriodo() {
        pendulo = new Pendulo(40);
        double periodo = pendulo.getPeriodo(GRAVEDAD_LUNA);
        Assertions.assertEquals(31.22, periodo, 0.01);
    }

    @Test
    public void testGetPeriodoLongitudInvalida() {
        pendulo = new Pendulo(-10);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            pendulo.getPeriodo(GRAVEDAD_LUNA);
        });
    }

    @Test
    public void testGetPeriodoGravedadInvalida() {
        pendulo = new Pendulo(40);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            pendulo.getPeriodo(-10);
        });
    }

    @Test
    public void testGetAceleracionAngular() {
        pendulo = new Pendulo(40);
        double aceleracion = pendulo.getAceleracionAngular(GRAVEDAD_TIERRA, 30);
        Assertions.assertEquals(-0.122, aceleracion, 0.01);
    }

    @Test
    public void testGetAceleracionAngularLongitudInvalida() {
        pendulo = new Pendulo(-10);
        double aceleracion = pendulo.getAceleracionAngular(GRAVEDAD_TIERRA, 30);
        Assertions.assertEquals(0, aceleracion);
    }
}