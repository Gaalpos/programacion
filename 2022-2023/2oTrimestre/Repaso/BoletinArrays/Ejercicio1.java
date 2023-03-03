import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. Leer 5 números y mostrarlos en el mismo orden
introducido.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero en posicion " + i);
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));

    }
}