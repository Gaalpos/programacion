package dinamico;

import java.util.ArrayList;

public class ejemplo5 {

    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>(); 
            colores.add("rojo"); 
            colores.add("verde"); 
            colores.add("azul"); 
            colores.add("blanco"); 
            colores.add("amarillo"); 

            //PUEDE HABER REPETICIONES ----> SI
            colores.add("blanco"); 
            System.out.println("Contenido de la lista: "); 
           for(String color: colores) { 
            System.out.println(color); 
            } 


            
            if (colores.contains("blanco")) { 
            System.out.println("El blanco está en la lista de colores"); 
            } 
            colores.remove("blanco"); 
            System.out.println("Contenido de la lista después de quitar la " 
            + 
            "primera ocurrencia del color blanco: "); 
            for(String color: colores) { 
            System.out.println(color); 
            } 
            
            
            colores.remove(2); 
            System.out.println("Contenido de la lista después de quitar el " 
            + "elemento de la posición 2: "); 
            for(String color: colores) { 
            System.out.println(color); 
            } 
     } 
    }     
    
