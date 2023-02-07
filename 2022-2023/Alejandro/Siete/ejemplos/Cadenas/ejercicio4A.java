package Cadenas;

import java.util.Scanner;

/* Crea un programa en java que solicite al usuario dos cadenas de cacateres 
y que devuelva la primera cadena, pero transformando an mayúsculas 
la parte que coincide con la segunda cadena introducida.*/ 



public class ejercicio4A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String cad = sc.nextLine();

        System.out.println("Dame una frase: ");
        String cad2 = sc.nextLine();
        
        System.out.println(esPalindromo(palabra));
    }
}
