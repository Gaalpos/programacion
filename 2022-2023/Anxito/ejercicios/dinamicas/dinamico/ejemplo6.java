package dinamico;

import java.util.ArrayList;

public class ejemplo6 {
    
public static void main(String[] args) {
    ArrayList<String> colorines = new ArrayList<String>(); 
    colorines.add("rojo"); 
    colorines.add("verde"); 
    colorines.add("azul"); 
    colorines.add("blanco"); 
    colorines.add("amarillo"); 
        System.out.println("Contenido del vector: "); 
        for(String color: colorines) 
        System.out.println(color); 

        //LOS PELIGROS DEL SET
        colorines.set(2, "turquesa"); 
        System.out.println("Contenido del vector después de machacar la  posición 2: "); 
        for(String color: colorines) { 
        System.out.println(color); 
        } 
  } 
} 

