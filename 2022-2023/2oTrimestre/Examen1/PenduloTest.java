import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PenduloTest {

    @Test
    void testGetPeriodo() {
        
        Pendulo p = new Pendulo(5);
        double periodo = p.getPeriodo(9.8f);
        assertEquals(4.487, periodo, 0.1);
    }
    @Test
    void testGetAceleracionAngular() {
        Pendulo p = new Pendulo(5);
        double AceleracionAngular = p.getAceleracionAngular(9.8f, 2);
        assertEquals(-0.00116, AceleracionAngular, 0.1);

    }


    
    // @Test
    // void testGetFrecuencia() {

    // }

   
}
