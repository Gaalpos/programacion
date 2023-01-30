package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
=======


>>>>>>> d91e5200f79659e081e88cd31a959a5f409d6a21
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        int[] arr2 = new int[12];
        int[] arr3 = new int[24];
<<<<<<< HEAD
        int j = 0;
=======
        int j = 1;
        int long1 = 0;
        int long2 = 0;
>>>>>>> d91e5200f79659e081e88cd31a959a5f409d6a21
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce un numero para cadena 2: ");
            arr2[i] = sc.nextInt();

        }

<<<<<<< HEAD
        for (int i = 0; i < 24; i++) {
            while (j < 3) {
                arr3[i] = arr[i];
                j++;
            }

            while (j > 3 && j < 6) {
                arr3[i] = arr2[i];
                j++;
            }
            j = 0;

        }
        System.out.println(Arrays.toString(arr3));
    }
=======
        Scanner sc= new Scanner(System.in);
            int[] arr=new int[12];
            int[] arr2=new int[12];
            int[] arr3=new int[8];
        int j=0;
            for(int i=0;i<arr.length;i++){
                System.out.println("Introduce un numero para cadena 1: ");
                arr[i]=sc.nextInt();
    
            }
            for(int i=0;i<arr2.length;i++){
                System.out.println("Introduce un numero para cadena 2: ");
                arr2[i]=sc.nextInt();
                
            }
            
            for(int i=0;i<10;i++){
    
                arr3[j]=arr[i];
=======
        for (int i = 0; i < arr3.length;i++) {
            if (j <= 3) {
                arr3[i] = arr[long1];
                long1++;       
>>>>>>> d91e5200f79659e081e88cd31a959a5f409d6a21
                j++;
            }
<<<<<<< HEAD
            System.out.println(Arrays.toString(arr3));
    }    
>>>>>>> 02d14455e15fef57119e0a6f27e386c0d92806b4
=======

            else if (j > 3 && j <= 6) {
                arr3[i] = arr2[long2];
                long2++;
                j++;
            }
            else{
                arr3[i] = arr[long1];
                long1++;
                j = 2;
            }
           

        }
        System.out.println(Arrays.toString(arr3));
    }

>>>>>>> d91e5200f79659e081e88cd31a959a5f409d6a21
}

    

