package Boletin;

import java.util.Scanner;

public class ejercicio16 {

    // 16. Queremos desarrollar una aplicación que nos ayude a
// gestionar las notas de un centro educativo. Cada grupo (o
// clase) está compuesto por 5 alumnos. Se pide leer las notas
// del primer, segundo y tercer trimestre de un grupo. Debemos
// mostrar al final: la nota media del grupo en cada
// trimestre, y la media del alumno que se encuentra en la
// posición N (N se lee por teclado).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alumnos = {1,2,3,4,5};
        int[] notas = new int[15];
        int mprimer=0;
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
// Primer Trimestre Medias
        for (int i = 0; i < notas.length; i+=3) {
            
        }


    }
}
