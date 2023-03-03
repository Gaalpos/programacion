package Cadenas;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    String cadena, inversa;
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduce cadena a invertir: ");    
    cadena=sc.nextLine();

    //Escrita en orden inverso

    StringBuilder sb= new StringBuilder(cadena);
    inversa=sb.reverse().toString();
    System.out.println(cadena);
    System.out.println(inversa);


    }
    
}
