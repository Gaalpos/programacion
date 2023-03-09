<<<<<<< HEAD
package Boletin;

public class ejercicio11 {
    public static void main(String[] args) {
        
    }
}
=======
package Boletin;

import java.util.Scanner;

public class ejercicio11 {
    // 11. Leer 5 elementos numéricos que se introducirán
// ordenados de forma creciente. Éstos los guardaremos en una
// tabla de tamaño 10. Leer un número N, e insertarlo en el
// lugar adecuado para que la tabla continúe ordenada.

public static void main(String[] args) { int t[]=new int[10];
    Scanner sc = new Scanner(System.in);
    int num,sitio_num,j;
    
    for (int i=0;i<5;i++) {
    
    System.out.print("Introduzca número (ordenado crecientemente): ");
    
    t[i]=sc.nextInt();
    
    }
    
    System.out.println();
    
    System.out.print("Número a insertar entre los anteriores: ");
    
    num=sc.nextInt();
    
    sitio_num=0;
    
    j=0;
    
    sitio_num ++;
    
    j++;
    
    // desplazaremos los elementos desde el sitio_num hasta el final // así haremos un hueco para num
    
    for (int i=4; i>=sitio_num; i--) t[i+1]=t[i];
    
    // por último ponemos num en su sitio para que todo siga ordenado t[sitio_num]=num;
    
    System.out.println("La nueva serie ordenada queda: ");
    
    for (int i=0;i<5+1;i++) System.out.println(t[i]);
    
    } 
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
