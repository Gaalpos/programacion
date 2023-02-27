package Examen2T;

import java.util.Arrays;

public class ejercicio1a {

    public static void RellenaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (200 - 100)) + 100;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20];

        RellenaArray(arr);
        System.out.println(Arrays.toString(arr));
        String numeroTexto;
        for (int i = 0; i < arr.length; i++) {
            numeroTexto = String.valueOf(arr[i]);
            if (numeroTexto.endsWith("2")) {
                System.out.println("El numero " + numeroTexto + " se encuentra en la posicion " + i);
            }
        }

    }
}
