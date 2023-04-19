package Pruebas.Exam2T;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String cad = sc.nextLine();

        System.out.println("Dame una frase: ");
        String cad2 = sc.nextLine();

        String[] arr = cad.split(" ");
        /* String[] arr2 = cad2.split(" "); */
        String result="";    
        for (int i = 0; i < arr.length; i++) {
            if (cad2.contains(arr[i])){
                result += " "+arr[i].toUpperCase();

            }
            else
            result += " "+arr[i];
        }
        System.out.println(result);
      
    }
}
