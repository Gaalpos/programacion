package Pruebas.Exam2T;

import java.util.Scanner;

public class ejercicio3A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce palabra");
        String cad= sc.nextLine();

        
        for (int i = cad.length() - 2; i >= 0; i--) {
            cad += cad.charAt(i);
        }
        System.out.println();
        System.out.println(cad);

       
    }
}
