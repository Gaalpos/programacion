package Boletin;

import java.util.Scanner;
/*3. Leer 5 números por teclado y a continuación realizar la 
media de los números positivos, la media de los negativos y 
contar el número de ceros. */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int positivos=0,cpositivos=0,negativos=0,cnegativos=0,ceros=0;
        for(int i=0;i<5;i++){
            System.out.println("Introduce un numero: ");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positivos+=arr[i];
                cpositivos++;
            }
            else if(arr[i]<0){
                negativos+=arr[i];
                cnegativos++;
            }
            else{
                ceros++;
            }
        }
        System.out.println("Media postivos: "+positivos/cpositivos);
        System.out.println("Media negativos: "+negativos/cnegativos);
        System.out.println("Numero de ceros: "+ceros);

    }
    }
   

