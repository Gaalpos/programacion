import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

   @Test
   void testMillasAKm() {
       Conversor conv = new Conversor();
       conv.setMillas(3);
       float result = conv.millasAKm();
       assertEquals(4.82803, result, 0.01);
   }

   @Test
   void testKmAMillas() {
       Conversor conv = new Conversor();
       conv.setKm(3);
       float result = conv.kmAMillas();
       assertEquals(1.86411, result, 0.01);
   }
}

