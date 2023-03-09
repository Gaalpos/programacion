package dinamico;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo13 {

    public static void main(String[] args) { 
        ArrayList<Gato> g = new ArrayList<Gato>(); 
        g.add(new Gato("Garfield", "naranja", "mestizo",13)); 
        g.add(new Gato("Pepe", "gris", "angora",2)); 
        g.add(new Gato("Mauri", "blanco", "manx",4)); 
        g.add(new Gato("Ulises", "marrón", "persa",1)); 
        g.add(new Gato("Adán", "negro", "angora",1)); 

        System.out.println("\nDatos de los gatos desordenados");
        for(Gato gatoAux: g) {
            System.out.println(gatoAux);
        }


        //ORDENA POR EL METODO compareTo
        Collections.sort(g); 

        System.out.println("\nDatos de los gatos ordenados por nombre:"); 
        System.out.println("\nEn caso de empate primero alfabeticamente:"); 
        for (Gato gatoAux: g) { 
        System.out.println(gatoAux); 
        } 
        } 
    
}
