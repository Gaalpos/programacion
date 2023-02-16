package repasoLiberatorio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class repaso2 {

    public static int[] pideNumeros(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Indice " + i + ": ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int[] rotarPosicion(int[] a) {
        int aux = 0;
        aux = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];

        }
        a[0] = aux;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];
        int rotar;
        pideNumeros(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Cuantas posiciones quieres rotar?");
        rotar = sc.nextInt();
        for (int i = 0; i < rotar; i++) {
            rotarPosicion(arr);

        }
        System.out.println("rotando " + rotar + " a la derecha");
        System.out.println(Arrays.toString(arr));

    }

}


