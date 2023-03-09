

import java.util.Scanner;

public class ejercicio1 {
    /*
     * 1. Leer 5 números y mostrarlos en el mismo orden
     * introducido.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int[] numeritos = new int[5];

        for(int i=0;i<numeritos.length;i++ ){
            System.out.println("Numerito posicion :"+i);
            n=sc.nextInt();
            numeritos[i]=n;
        }
       
        for(int i=0;i<numeritos.length;i++ ){
            System.out.println("Numerito posicion :"+i+ ": "+ numeritos[i]);
        
        }
       sc.close();
    }
}
