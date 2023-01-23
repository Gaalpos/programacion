package boletin;

import java.util.Scanner;

/*3. Leer 5 números por teclado y a continuación realizar la 
media de los números positivos, la media de los negativos y 
contar el número de ceros. */

public class ejercicio3 {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; 
        int i;
       
        //Leemos los valores por teclado y los guardamos en el array                                              
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
  
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
  
        //mostrar resultados
        System.out.println(" ");
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
 
}