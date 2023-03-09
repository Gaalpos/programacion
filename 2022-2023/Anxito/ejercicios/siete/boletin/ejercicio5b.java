package boletin;

import java.util.Arrays;

public class ejercicio5b {
    
public static void main(String[] args) {
    int[] arr1 = {1,3,5,7,9,11};
    int[] arr2 = {2,4,6,8,10,12,14,16,18};
    
    int suma=arr1.length+arr2.length;
    int[] mix = new int[suma];
    int minimo=Math.min(arr1.length, arr2.length);
    
    int j=0;
    
    for(int i=0;i<minimo;i++) {
        mix[j]=arr1[i];
        j++;
        mix[j]=arr2[i];
        j++;
    }

    //añadir algo mas??
    if(arr1.length>arr2.length) {
    for(int i=minimo*2;i<suma;i++){
    mix[i]=arr1[minimo];
    minimo++;
    }
    
}else{
    for(int i=minimo*2;i<suma;i++){}
    mix[j]=arr1[minimo];
    minimo++;
    }
    System.out.println(Arrays.toString(mix));
}
}



