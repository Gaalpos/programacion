package Examen2T;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class ejercicio3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Introduce cadena: ");
        String cadena = sc.nextLine();
        String[] trozos= cadena.split(",");
        System.out.println(Arrays.toString(trozos));
        for (String s: trozos) {
            suma+= Integer.parseInt(s);
        }

        System.out.println("La suma de los numeros de la cadena es: "+ suma);
    }
}
