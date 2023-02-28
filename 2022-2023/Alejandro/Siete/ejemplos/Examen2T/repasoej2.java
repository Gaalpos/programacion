package Examen2T;

import java.util.Arrays;
import java.util.Scanner;

public class repasoej2 {


    public static void insertionsort(int [] numbers) {
		for(int i=0; i<numbers.length; i++) {
			int copyNumber = numbers[i];
			int j=1;
			while(j> 0 && copyNumber < numbers[j-1]) {
				numbers[j] = numbers[j-1];
				j--;
			}
			numbers[j]=copyNumber;
		}
	}


    public static int[] fusionar(int[]arr1,int[]arr2){
        int[] arr3 = new int[12];
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr3.length; i++) {

            if (a < arr1.length && b < arr2.length) {
                if (arr1[a] > arr2[b]) {
                    arr3[i] = arr1[a];
                    a++;
                    if (a == arr1.length)
                        a++;

                } else {
                    arr3[i] = arr2[b];
                    if (b == arr2.length)
                        b++;

                }
            }
            if (a < arr1.length && b >= arr2.length) {
                arr3[i] = arr1[a];
                a++;

            }
            if (a >= arr1.length && b < arr2.length) {
                arr3[i] = arr2[b];
                b++;

            }
        }



        return arr3 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduce numero para array 1: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce numero para array 2: ");
            arr2[i] = sc.nextInt();
        }
       insertionsort(arr1);
       insertionsort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        

        // NOTA: Una vez que se haya completado uno de los arrays
        // ya no debería hacer comparaciones y completaría
        // con el resto que falta de otros

       
        System.out.println(Arrays.toString(fusionar(arr1, arr2)));

    }
}
