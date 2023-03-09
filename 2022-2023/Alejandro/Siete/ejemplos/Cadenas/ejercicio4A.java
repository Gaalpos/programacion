package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

/* Crea un programa en java que solicite al usuario dos cadenas de cacateres 
y que devuelva la primera cadena, pero transformando an mayúsculas 
la parte que coincide con la segunda cadena introducida.*/

public class ejercicio4A {

    /*
     * public static String compararCadenas(String[] arr, String[] arr2) {
     * String uno = "";
     * 
     * for (int i = 0; i < arr.length; i++) {
     * for (int j = 0; j < arr2.length; j++) {
     * if (arr[i].equals(arr2[j]))
     * arr[i] = arr[i].toUpperCase();
     * uno += " " + arr[i];
     * }
     * 
     * }
     * 
     * return uno;
     * 
     * 
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String cad = sc.nextLine();

        System.out.println("Dame una frase: ");
        String cad2 = sc.nextLine();

        String[] arr = cad.split(" ");
        /* String[] arr2 = cad2.split(" "); */

        for (int i = 0; i < arr.length; i++) {
            if (cad2.contains(arr[i]))
                arr[i] = arr[i].toUpperCase();
        }
        String cadenaNueva = "";
        for (int i = 0; i < arr.length; i++) {
            if (cad2.contains(arr[i]))
                cadenaNueva = cadenaNueva.concat(arr[i]);
        }

        System.out.println(cadenaNueva);
        // System.out.println(compararCadenas(arr, arr2));
    }
}
