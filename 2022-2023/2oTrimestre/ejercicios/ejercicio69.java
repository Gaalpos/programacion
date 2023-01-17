import java.util.Arrays;

/**
 * ejercicio69
 */
public class ejercicio69 {

    public static int sumaValores(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int[] rellenaPotenciaDos(int capacidad) {
        int[] potencias = new int[capacidad];
        for (int i = 0; i < potencias.length; i++) {
            potencias[i] = (int) Math.pow(2, i);
        }
        return potencias;
    }

    public static void main(String[] args) {

        int[] potencias;
        potencias = rellenaPotenciaDos(12);
        System.out.println(Arrays.toString(potencias));
        int suma = sumaValores(potencias);
        System.err.println(suma);
    }
}