package boletin;

import java.util.Scanner;

// 8. Diseñar una aplicación que declare una tabla de 10 
// elementos enteros. Leer mediante el teclado 8 números. 
// Después se debe pedir un número y una posición, insertarlo 
// en la posición indicada, desplazando los que estén detrás.

public class ejercicio8 {

    
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        
        int numero,posicion;
        
        int[] tabla = new int[10];
        
        for (int i=0; i<8; i++) {
        
        System.out.println("Dame un numero");
        
        tabla[i]=captura.nextInt();
        
        }
        
        
        System.out.println("ingrese numero");
        
        numero=captura.nextInt();
        
        System.out.println("");
        System.out.println("ingrese posicion");
        
        posicion=captura.nextInt();
        
        for (int i = 8; i >= posicion; i--) {
        
        tabla[i+1]=tabla[i];
        
        }
        
        tabla[posicion]=numero;
        
        System.out.println("La tabla queda:");
        
        for (int i = 0; i < 10; i++) {
        
        System.out.println(tabla[i]);
        
        }
        
        }
    }

