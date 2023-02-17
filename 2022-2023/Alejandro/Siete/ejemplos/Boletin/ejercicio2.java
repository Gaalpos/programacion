package Boletin;
/*2. Leer 5 números y mostrarlos en orden inverso al 
introducido.*/
public class ejercicio2 {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
