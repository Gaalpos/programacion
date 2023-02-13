import java.util.Scanner;

public class ejercicio5 {

    /*
     * 5. Leer por teclado dos tablas de 10 números enteros y
     * mezclarlas en una tercera de la forma: el 1o de A, el 1o de
     * B, el 2o de A, el 2o de B, etc.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array1 = {1, 3 , 5 , 7 , 9, 11, 13, 15, 17, 19};
        int [] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int [] mezcla = new int[array1.length*2];

        for (int i=0, j=0; i<array1.length; i++, j=j+2){
            mezcla[j]= array1[i];
            mezcla[j+1] = array2[i];
        }

    
        for(int k=0; k<mezcla.length;k++) {
			System.out.println(mezcla[k]);   
		}



    
        sc.close();

        
    }
}
