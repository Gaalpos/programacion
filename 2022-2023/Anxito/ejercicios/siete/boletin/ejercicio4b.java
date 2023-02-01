package boletin;

import java.util.Scanner;

/*4b. Leer 11 números enteros. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el 
penúltimo, el tercero, etc. */

public class ejercicio4b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[10];
        for(int i=0; i <11;i++ ) {
            System.out.println("Introduzca un numero:");
            numero[i] = sc.nextInt();
        }

        System.out.println("El resutlado es: ");
        for(int i=0;i<=5; i++) {
            
        }
    }
    
}
