package Examen2T;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4b {
    static String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q",
    "r", "s", "t", "u", "v", "w", "x", "y", "z" };

static int[] res = new int[letras.length];

public static int recorrido(String cadena, String car) {
int total = 0;
for (int i = 0; i < cadena.length(); i++) {
    if (cadena.charAt(i) == car.charAt(0)) {
        total++;
    }
}
return total;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("introduce una cadena: ");
String cadena = sc.nextLine();
cadena = cadena.toLowerCase().replaceAll(" ", " ");
for (int j = 0; j < letras.length; j++) {
    res[j] = recorrido(cadena, letras[j]);
}
int max=0;

    for(int j = 0; j < letras.length; j++){
        if (res[j] > max) {
            max=res[j];
        }
    }
    System.out.println("La letra que mas se repite es: "+res[max]);
    max=0;

    for(int j = 0; j < letras.length; j++){
        if (res[j] > max) {
            max=res[j];
        }
    }
    System.out.println("La segunda letra que mas se repite es: "+res[max]);
    max=0;

    for(int j = 0; j < letras.length; j++){
        if (res[j] > max) {
            max=res[j];
        }
    }
    System.out.println("La tercera letra que mas se repite es: "+res[max]);
    max=0;

}
}
