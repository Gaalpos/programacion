package Boletin;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alumnos = new int[5];
        int[] notas = new int[15];
        for (int i = 0; i < notas.length; i++) {
            if (i < 3) {
                System.out.println("Introduce nota para alumno 1: ");
                notas[i] = sc.nextInt();
            } else if (i > 3 && i < 6) {
                System.out.println("Introduce nota para alumno 2: ");
                notas[i] = sc.nextInt();
            } else if (i > 6 && i < 9) {
                System.out.println("Introduce nota para alumno 3: ");
                notas[i] = sc.nextInt();
            } else if (i > 9 && i < 12) {
                System.out.println("Introduce nota para alumno 4: ");
                notas[i] = sc.nextInt();
            } else {
                System.out.println("Introduce nota para alumno 5: ");
                notas[i] = sc.nextInt();
            }
        }

    }
}
