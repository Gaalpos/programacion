import java.util.Scanner;

/*
 * 2. Leer 5 números y mostrarlos en orden inverso al
introducido.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        //int aux;

        
        for (int i = 0; i<numeros.length;i++){
            System.out.println(" Numero para la posicion "+ i);
            numeros[i]=sc.nextInt();
        }
        System.out.println();
        for (int i = numeros.length-1; i>=0; i-- ){
        // System.out.println(" numero en posicion "+(i-1) + " : " + numeros[i]);
        System.out.println(" Numero en la posicion " +(i) + " : " + numeros[i]);


        }

    }


}
