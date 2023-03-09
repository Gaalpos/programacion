package dinamico;

import java.util.ArrayList;

public class ejemplo7 {

    public static void main(String[] args) { 
        ArrayList<String> colores = new ArrayList<String>(); 
        colores.add("rojo"); 
        colores.add("verde"); 
        colores.add("azul"); 
        colores.add("blanco"); 
        colores.add("amarillo"); 
        System.out.println("Contenido de la lista: "); 
        for(String color: colores) { 
        System.out.println(color); 
        } 
        //chequea primero si es accesible al lugar uno
        colores.add(1, "turquesa"); 
        System.out.println("Contenido del vector después de insertar en  la posición 1: "); 
        for(String color: colores) { 
        System.out.println(color); 
        } 
    } 
} 
        
    

