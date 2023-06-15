import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AulaTest {
   Aula dam1;
   // se ejecuta justo antes de cada test
   @BeforeEach
   void setUp() throws Exception {
       dam1 = new Aula();
      
       Alumno a1 = new Alumno(19, 1.70f);
       Alumno a2 = new Alumno(22, 2.10f);
       Alumno a3 = new Alumno(14, 1.50f);
       Alumno a4 = new Alumno(26, 1.77f);
       Alumno a5 = new Alumno(19, 1.75f);
      
       dam1.alumnos[0] = a1;
       dam1.alumnos[1] = a2;
       dam1.alumnos[2] = a3;
       dam1.alumnos[3] = a4;
       dam1.alumnos[4] = a5;
   }
  
   @Test
   void testMediaAltura() {
       float media = dam1.mediaAltura();
       assertEquals(1.764, media, 0.01);
   }

   @Test
   void testMediaEdades() {
       float media = dam1.mediaEdades();
       assertEquals(20, media, 0.01);
   }

   @Test
   void testMayoresEdad() {
       int contador = dam1.mayoresEdad();
       assertEquals(4, contador);
   }

   @Test
   void testAlturaMayor() {
       int contador = dam1.alturaMayor(1.75f);
       assertEquals(3, contador);
   }

}
