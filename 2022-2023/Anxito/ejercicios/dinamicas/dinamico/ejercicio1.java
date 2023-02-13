package dinamico;

// Crea un ArrayList con los nombres de 6 compañeros de 
// clase. A continuación, 
// muestra esos nombres por pantalla. Utiliza para ello un 
// bucle for que recorra 
// todo el ArrayList sin usar ningún índice. 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ejercicio1 {

    public static void main(String[] args) {
        
        ArrayList <String> compis = new ArrayList<>();

        compis.add("david");
        compis.add("alejandro");
        compis.add("rafa");
        compis.add("gaalpos");
        compis.add("yowy");
        compis.add("pepe");

        Collections.sort(compis);

        for(String s:compis)
            System.out.println(s);
    }
    
}
