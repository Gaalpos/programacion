package Examen2TProgramacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int[] nuevo = new int[9];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero para posicion " + i);
            valores[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(valores));
        System.out.println("Introduce posicion a eliminar: ");
        int p = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (i != p) {
                nuevo[contador] = valores[i];
                contador++;
            }
        }
        System.out.println("Array final: ");
        System.out.println(Arrays.toString(nuevo));
    }
}
