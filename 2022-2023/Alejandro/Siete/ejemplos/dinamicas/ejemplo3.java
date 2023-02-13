package Dinamicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Como convertir un array estático en un array dinámico
        String[] unas= {"A Coruña","Lugo","Ourense","Pontevedra"};
        ArrayList<String> provincias = new ArrayList<String>(Arrays.asList(unas));
        System.out.println(provincias);
       

        // utilizar un foreach V 2.0
        int i=0;
        for(String s: provincias){
            System.out.println("posicion "+i+" valor: "+s);
            i++;
        }
    

     // utilizar un foreach V 3.0 que permita modificar el valor del array
     int j=0;
     for(String s : provincias){
       // Integer ent= new Integer(0);
        //ent= a.get(j);
         System.out.println("posicion "+j+" valor: "+s);
         System.out.println("nueva provincia: ");
         s=sc.nextLine();
         provincias.set(j, s);
         j++;
     }
     System.out.println(provincias);
 }
}
