import java.util.Arrays;

public class SumarArray {

   public static void main(String[] args) {
       SumarArray programa = new SumarArray();
       programa.iniciar();

   }
  
   public void iniciar() {
       // Crear un array de 20 posiciones
       int[] array = new int[20];
       // Rellenar ese array con numeros aleatorios
       array = rellenarConNumerosAleatorios(array);
       System.out.println(Arrays.toString(array));
       // Calcular cual es la suma de todos los numeros del array
       int suma = sumarArray(array);
       System.out.println(suma);
       // Calcular cual es la media de todos los numeros del array
       double media = mediaArray(array);
       System.out.println(media);
   }
  
   public double mediaArray(int[] array) {
       return (double)(sumarArray(array) / (double)array.length);
   }
  
   public int sumarArray(int[] array) {
       int suma = 0;
       for(int i=0;i<array.length;i++) {
           suma += array[i];
       }
       return suma;
   }
  
   public int[] rellenarConNumerosAleatorios(int[] array) {
       for(int i=0;i<array.length;i++) {
           array[i] = (int)(Math.random()*10);
       }
       return array;
   }

}

