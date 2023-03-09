package ejercicios;

import java.util.Arrays;

/*
 * Ecribe un metodo de nombre completarArray, que reciba un array de enteros por parámetro y 
 * lo rellene de forma que asigne cada posicion al valor de su indice
 */

public class ejercicio65 {

    public static int[] completarArray(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            arr[k] = k;
        }
        return arr;
    }

    public static int[] rellenarArray(int[] arr, int valor) {
        for (int k = 0; k < arr.length; k++) {
            arr[k] = valor;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] altos = { 111, 222, 333, 444, 555, 666, 777, 888, 999 };
        System.out.println(Arrays.toString(altos));
        completarArray(altos);
        System.out.println(Arrays.toString(altos));

        rellenarArray(altos, 345);
        System.out.println(Arrays.toString(altos));
    }
}
