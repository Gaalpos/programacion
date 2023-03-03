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


    public static int[] fusionar(int [] Arr, int [] Arr2){
		
		
		int [] res = new int [Arr.length*2];
		int cont1=0;
		int cont2=0;
		for(int i=0; i<res.length; i++){
			if(cont1<Arr.length && cont2<Arr2.length) {
				if(Arr[cont1]>=Arr2[cont2]) {
					res[i]=Arr[cont1];
					cont1++;
					if(cont1==Arr.length) {
						i++;
					}
				}else {
					res[i]=Arr2[cont2];
					cont2++;
					if(cont2==Arr2.length) {
						i++;
					}
				}
			}
			
			if(cont1<Arr.length && cont2>=Arr2.length) {
				res[i]=Arr[cont1];
				cont1++;
			}
			if(cont2<Arr2.length && cont1>=Arr.length) {
				res[i]=Arr2[cont2];
				cont2++;
			}
			}
		return res;
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
