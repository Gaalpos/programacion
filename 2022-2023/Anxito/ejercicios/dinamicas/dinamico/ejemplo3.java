package dinamico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejemplo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //como convertir un array estatico
        String[] unas = {"A coruña", "Lugo","Ourense","Pontevedra"};        
        ArrayList<String> provincias= new ArrayList<String> ( Arrays.asList(unas) );
        System.out.println(provincias);

         //utilizar un foreach v2.0
         int i=0;
         for(String s:provincias) {
         System.out.println("posicion: "+i+" valor :"+s);
         i++;
 }   
    
        int j=0;
        for(String s: provincias) {
            System.out.println("posicion: "+j+" valor :"+s);
            System.out.println("nueva provincia");
            s=sc.nextLine();
            provincias.set(j,s);
            j++;
        }
        
        System.out.println(provincias);

    }
}

