import java.util.Arrays;
import java.util.Scanner;

public class repaso2 {


public static int[] pideNumeros(int[]a){

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<a.length;i++){
        System.out.println(" indice "+i+" :");
        a[i]=sc.nextInt();
    }
    return a;

}

    public static int[] rotarPosiciones(int[]a){
        int aux=0;
        aux=a[a.length-1];

        for(int i=0; i<a.length;i++){
           a[i]=a[i-1];
        }
        a[0]= aux;

        return a;
    }

    public static int[] rotarVariasPosiciones(int[]a, int pos){
        for(int i=0; i<pos;i++){
            rotarPosiciones(a);
          
         }
         return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[15];
        pideNumeros(arr);
        System.out.println(Arrays.toString(arr));
        //rotarPosiciones(arr);
        System.out.println("Posiciones a rotar");
        int p = sc.nextInt();
        rotarVariasPosiciones(arr, p);
        System.out.println("Rotando "+p+ " a la derecha");
        System.out.println(Arrays.toString(arr));
    }
    
}
