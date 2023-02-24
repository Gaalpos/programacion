package Boletin;
/*4. Leer 10 números enteros. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el 
penúltimo, el tercero, etc. */
public class ejercicio4 {
    public static void main(String[] args) {
        
        int[] arr={21,55,12,87,453,14,146,65,39,41};
        int maximo=arr.length-1;
        int uno=arr[0],dos=arr[maximo];
        
        for(int i=0;i<maximo/2;i++){
            System.out.println(arr[i]);
            System.out.println(arr[maximo-i]);
        
        }
    }
    }

