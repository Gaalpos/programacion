package repasoLiberatorio;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        int pos=0, neg=0, ceros=0;

        //Leemos los numeros por teclado y los guardamos en el array
        System.out.println("Lectura de los numeros del array: ");
            for(int i=0; i<numero.length;i++) {
                System.out.println("numeros: "+i+ " ");
                numero[i]=sc.nextInt();
            }

        //Recorremos el bucle para contar los numeros positivos y negativos

            for(int i=0; i<numero.length;i++) {
                if(numero[i]>0) {
                    pos++;
                }else if(numero[i]<0){
                    neg++;
                }else{
                    ceros++;
                }
            }

            System.out.println("Positivos: "+pos);
            System.out.println("Negativos: "+neg);
            System.out.println("Ceros: "+ceros);


    }
    
}
