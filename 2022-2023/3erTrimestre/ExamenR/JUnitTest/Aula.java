public class Aula {
   // Constante que almacena el n'mero de alumnos
   final static int NUM_ALUMNOS = 5;

   Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
  
   float mediaAltura() {
       float suma = 0;
       for(int i=0; i<alumnos.length; i++) {
           //suma = suma + alumnos[i].altura;
           suma += alumnos[i].altura;
       }
       return suma / alumnos.length;
   }
  
   float mediaEdades() {
       float suma = 0;
       for(int i=0; i<alumnos.length; i++) {
           //suma = suma + alumnos[i].edad;
           suma += alumnos[i].edad;
       }
       return suma / alumnos.length;
   }
  
   int mayoresEdad() {
       int contador = 0;
       for(int i=0; i<alumnos.length; i++) {
           if( alumnos[i].edad >= 18 ) {
               contador++;
           }
       }
       return contador;
   }
   int alturaMayor(float altura) {
       int contador = 0;
       for(int i=0; i<alumnos.length; i++) {
           if( alumnos[i].altura >= altura ) {
               contador++;
           }
       }
       return contador;
   }
}
