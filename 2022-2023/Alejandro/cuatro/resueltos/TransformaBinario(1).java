package resueltos;

import java.util.Scanner;


public class TransformaBinario {

    public static void muestraCifra(int dat) {
    
        if(dat<10) {
        System.out.println(dat);
        }else {
        dat-=10;
        char c= (char) ('A'+dat);
        System.out.println(c);
        }
        }
    
public static void transforma2(int dato) {
    if(2>dato)
    System.out.print(dato);

else
transforma2(dato/2);
System.out.println(dato%2);
}

public static void transforma8(int dato) {
    if(dato<8)
    System.out.print(dato);

else
transforma8(dato/8);
System.out.println(dato%8);
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un dato: ");
    int dato=sc.nextInt();
    
    System.out.println("Pasado a binario es: ");
    transforma2(dato);
    System.out.println("Pasado a octal es: ");
    transforma8(dato);
    }
}
