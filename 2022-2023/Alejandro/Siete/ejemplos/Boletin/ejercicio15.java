package Boletin;

import java.util.Scanner;
/*
 * Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se
encuentra. Si no está, indicarlo con un mensaje.
 */
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Di un numero: ");
        n=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                System.out.println("El numero esta en la posicion: "+i);

            }
            else{
                
            }
        }
    }
}
