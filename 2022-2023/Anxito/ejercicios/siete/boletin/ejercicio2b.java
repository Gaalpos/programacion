package boletin;

import java.util.Scanner;

public class ejercicio2b {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    for(int i=0; i<numeros.length; i++) {
        System.out.println("Ingresa numero: "+i);
        numeros[i]=sc.nextInt(i);
    }
}

}
