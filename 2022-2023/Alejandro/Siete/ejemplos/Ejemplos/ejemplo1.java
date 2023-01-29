package Siete.ejemplos.Ejemplos;

import java.util.Scanner;

public class ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] temperaturas; // declarar un array de temperaturas

        int humedades[]; // hemos declarado un array de humedades

        temperaturas = new byte[10];

        int capacidad = 5;
        humedades = new int[capacidad];

        // Quedan organizados por un indice de posicion

        // Bucle clásico de recorrido de las posiciones de un array para introducir
        // datos
        System.out.println("Mostrando Temperaturas:");
        for (int j = 0; j < temperaturas.length; j++) {
            System.out.println("La temperatura para la posicion(indice) " + j + " es : " + temperaturas[j]);

        }
        System.out.println("Introduciendo Temperaturas:");
        for (int j = 0; j < temperaturas.length; j++) {
            System.out.println("introduce la temperatura para el (indice) " + j + " es : ");
            temperaturas[j] = sc.nextByte();
        }
        System.out.println("Mostrando Temperaturas y calculando su media:");
        int total = 0;
        for (int j = 0; j < temperaturas.length; j++) {
            System.out.println("La temperatura para la posicion(indice) " + j + " es : " + temperaturas[j]);
            total += temperaturas[j];

        }

        System.out.println("la media de las temperaturas es: " + total / temperaturas.length);

    }

}
