package dinamico;

import java.util.ArrayList;
import java.util.Comparator;

public class ejemplo1 implements Comparator <String>{
    
    public static void main(String[] args) { 

        //definicion
        ArrayList<String> colores = new ArrayList<String>(); 

        System.out.println("Nº de elementos: " + colores.size()); 

        colores.add("rojo"); 
        colores.add("verde"); 
        colores.add("azul"); 
        System.out.println("Nº de elementos: " + colores.size()); 
        colores.add("blanco"); 
        System.out.println("Nº de elementos: " + colores.size()); 

        System.out.println("El elemento que hay en la posición 0 es " + colores.get(0)); 
        System.out.println("El elemento que hay en la posición 3 es " + colores.get(3)); 
       
        for(int i=0; i<colores.size(); i++) {
            System.out.println("Posicion "+i+" color "+colores.get(i));

        }
        //cuando usamos objetos empleamos foreach SOLO PARA MOSTRAR

        for(String cad: colores)
        System.out.println("color "+cad);

        System.out.println(colores);
        colores.remove("blanco");
        System.out.println(colores);
        colores.sort(c);
    
    }

    @Override
    public int compare(String arg0, String arg1) {
        // TODO Auto-generated method stub
        return arg0.compareTo(arg1);
    }    
 } 
        


