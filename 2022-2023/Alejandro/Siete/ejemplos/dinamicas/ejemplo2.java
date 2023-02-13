package Dinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(18);
        a.add(22);
        a.add(-30);
        System.out.println("No de elementos: " + a.size());
        System.out.println("El elemento que hay en la posición 1 es " +
        a.get(1));
        System.out.println(a);
        System.out.println("ciudado con los set");
        a.set(1, 555);
        System.out.println(a);
        

        // utilizar un foreach V 2.0
        int i=0;
        for(Integer n : a){
            System.out.println("posicion "+i+" valor: "+n);
            i++;
        }
    

     // utilizar un foreach V 3.0 que permita modificar el valor del array
     int j=0;
     for(Integer n : a){
       // Integer ent= new Integer(0);
        //ent= a.get(j);
         System.out.println("posicion "+j+" valor: "+n);
         System.out.println("nuevo valor: ");
         n=sc.nextInt();
         a.set(j, n);
         j++;
     }
     System.out.println(a);
 }
}

