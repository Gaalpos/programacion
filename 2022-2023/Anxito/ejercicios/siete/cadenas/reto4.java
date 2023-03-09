package cadenas;

import java.util.Arrays;

// Reto4: usando el metodo compareTo, debe ORDENAR alfabetico un array de cadenas de texto

public class reto4 {

public static void insertionsort(float[] numbers) {
for(int i=0; i<numbers.length;i++) {
    float valor = numbers[i];
    int j=i;
    while(j> 0 && valor <numbers[j-1]) {
        //HACIENDO SITIO PARA INSERTAR
        numbers[j] = numbers[j-1];
        j--; 

    }
    //INSERTAMOS
    numbers[j] = valor;
}
}
    
//bubble sort //usar compareTo 
public static void burbuja(String[] arr) {

    String aux;
    for (int i = arr.length; i > 0; i--) {
        for (int j = 0; j < i - 1; j++) {
            // swap --> use usted compareTo
            //if (arr[j] > arr[j + 1]) {
              if(arr[j].compareTo(arr[j+1])>0)   {  
                aux = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = aux;
            }
        }
    }

}

public static void main(String[] args) {
    String[] arr = {"uno", "dos","tres", "cuatro","cinco", "seis","siete", "ocho","nueve", "diez"} ;
    System.out.println(Arrays.toString(arr));
    burbuja(arr);
    System.out.println(Arrays.toString(arr));  

    float[] mat ={1.1f,2.34f,1.15f,7.3f,6.2f};
    System.out.println(Arrays.toString(mat));

    insertionsort(mat);
    System.out.println(Arrays.toString(mat));
        
    
    }

}




