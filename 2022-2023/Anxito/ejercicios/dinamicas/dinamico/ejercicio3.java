package dinamico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Escribe un programa que ordene 10 números enteros 
// introducidos por teclado 
// y almacenados en un objeto de la clase ArrayList. 


public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<10;i++) {
            System.out.println("numero: ");
            lista.add(sc.nextInt());
        }

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }
    
}
