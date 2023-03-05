<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        
        for(int i=0;i<arr.length;i++){
            if(i==9){
                arr2[0]=arr[i];
            }
            else{
            arr2[i+1]=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr2));

    }
}
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// 9. Crear un programa que lea por teclado una tabla de 10
// números enteros y la desplace una posición hacia abajo: el
// primero pasa a ser el segundo, el segundo pasa a ser el
// tercero y así sucesivamente. El último pasa a ser el
// primero.
public class ejercicio9 {
    public static void desplazaDerecha(int[] lista){
        int i,ultimo;
        
        //Cojo el último elemento del array y lo guardo en "ultimo"
        ultimo=lista[lista.length-1];
        //desplazo todos los elementos de derecha a izquierda
        //dejando sin hueco en la primera posición
        for(i=lista.length-1; i>0; i--){
            lista[i]=lista[i-1];
        }
        //pongo en la primera posición "ultimo" que rescaté al principio
        lista[0]=ultimo;
    }
    
    public static void main(String[] args) {
        int[] numeros=new int[10];
        int i;
        
        //Inicializo el array con valores aleatorios del 1 al 100
        for (i=0;i < numeros.length;i++)
            numeros[i]=(int)(Math.random()*100+1);
        
        System.out.println("Array inicial: "+Arrays.toString(numeros));
        //desplazo a la derecha el array
        desplazaDerecha(numeros);
        System.out.println("Array desplazado: "+Arrays.toString(numeros)); 
    }
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
