import java.util.Scanner;

/*
 * 4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
      

        
        for (int i = 0; i<numeros.length;i++){
            System.out.println(" Numero para la posicion "+ i);
            numeros[i]=sc.nextInt();
        }

        for ( int i = 0; i < 5; i++){
            System.out.println(" Numero en posicion "+ i + " : " + numeros[i]);
            System.out.println(" Numero en posicion "+ (9-i) + " : " + numeros[9-i]);
        }


    }
 
    

}
