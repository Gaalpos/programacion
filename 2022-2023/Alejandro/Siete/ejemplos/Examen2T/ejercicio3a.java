package Examen2T;

import java.util.Scanner;

public class ejercicio3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Introduce cadena: ");
        String numeros = sc.nextLine();

        for (int i = 0; i < numeros.length(); i++) {
            suma += numeros.charAt(i);
        }

        System.out.println(suma);
    }
}
