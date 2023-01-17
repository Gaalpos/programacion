package varios;

import java.util.Arrays;

public class ejercicio67 {

    public static int[] arrayPotencias2(int capacidad) {
        int[] potencia = new int[capacidad];
        for (int i = 0; i < potencia.length; i++) {
            potencia[i] = (int) Math.pow(2, i);

        }
        return potencia;

    }

    public static int[] factorM(int[] arr, int fact) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= fact;
        }
        return arr;
    }

    public static int sumaValores(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;

    }

    // preparo un nuevo array
    public static int[] rellenaPares(int capacidad) {
        int[] pares = new int[capacidad];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }
        return pares;

    }

    public static int[] rellenaImpares(int capacidad) {
        int[] impares = new int[capacidad];
        for (int i = 0; i < impares.length; i++) {
            impares[i] = (i * 2) + 1;
        }
        return impares;

    }

    public static void main(String[] args) {

        int[] sumaPar = rellenaPares(12);
        System.out.println(Arrays.toString(sumaPar));

        int[] sumaImpar = rellenaImpares(15);
        System.out.println(Arrays.toString(sumaImpar));

        System.out.println("Suma del arrray de pares: " + sumaValores(sumaPar));
        System.out.println("Suma del arrray de impares: " + sumaValores(sumaImpar));

    }

}
