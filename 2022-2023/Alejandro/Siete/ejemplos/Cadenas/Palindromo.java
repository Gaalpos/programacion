package Cadenas;

import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String palabra) {
        
        String rev = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            rev = rev + palabra.charAt(i);
        }

        if (rev.equals(palabra))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra: ");
        String palabra = sc.nextLine();
        palabra=palabra.toLowerCase();
        System.out.println(esPalindromo(palabra));
    }
}
