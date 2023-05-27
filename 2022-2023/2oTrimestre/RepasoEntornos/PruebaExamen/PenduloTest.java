
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PenduloTest {

    public static void main(String[] args) {

    }

    Pendulo pendulo;
    float GRAVEDAD_TIERRA = 9.81f;
    float GRAVEDAD_LUNA = 1.62f;

    @Test
    public void testGetAceleracionAngular() {
        pendulo = new Pendulo(40);
        double periodo = pendulo.getPeriodo(GRAVEDAD_LUNA);
        Assertions.assertEquals(31.22, periodo, 0.01);
    }

    @Test
    public void testGetPeriodo() {
        pendulo = new Pendulo(GRAVEDAD_LUNA);
        double periodo = pendulo.getPeriodo(GRAVEDAD_LUNA);
    }
}
