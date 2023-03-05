<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int n;
        int j=0;
        System.out.println("Introduce cantidad a desplazar: ");
            n=sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        for(int x=0;x<n;x++){
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                arr2[0]=arr[i];
                }
                else{
                arr2[i+1]=arr[i];
                }
    
            }
        }
       
        
        
        System.out.println(Arrays.toString(arr2));

    }
}
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// 10. Ídem, desplazar N posiciones (N es introducido por el
// usuario).
public class ejercicio10 {
    public static int [] moverDerecha(int[]array) {
		int aux =0;
		aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		array[0]=aux;
		return array;
	}
	
	
	public static int[]moverIzquierda(int[]array){
		
		int aux =0;
		
		aux=array[0];
		
		for (int i = 0; i<array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1]=aux;
		return array;
	}
	
	public static void main(String[] args) {
		//pedir al usuario cuantas veces lo quiere mover
		int[] array = {1,2,3,4,5,6,7,8,9,10 };
		
		System.out.println("Array original "+Arrays.toString(array));
		Scanner sc= new Scanner (System.in);
		int veces=0;
		
		System.out.println("Cuantas veces quieres mover? ");
		veces=sc.nextInt();
		for (int i= 0;i<veces;i++) {
			moverIzquierda(array);
			System.out.println(Arrays.toString(array));
		}
		System.out.println("Array movido "+veces+ " veces:");
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
