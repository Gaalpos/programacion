package colecciones.listas;

import java.util.ArrayList;
import java.util.List;

public class ejemplo1 {

    public static void main(String[] args) {

        //constructores
        ArrayList<String> lista = new ArrayList<String>();
        //constructor con size
        ArrayList<String> otra = new ArrayList<String>(12);

        //void add(int index, E element)

        lista.add("uno");
        lista.add(1,"dos");
        System.out.println(lista);

        otra.add("uno");
        otra.add(0,"dos");
        System.out.println(otra);

        // void clear() permite limpiar un ArrayList
        otra.clear();
        System.out.println(otra);

        //boolean isEmpty()  Devuelve true si el ArrayList esta vacio
        System.out.println(otra.isEmpty());

        //E get(in index)
        System.out.println(lista.get(1));

        //int lastindexOf(Object o)

        System.out.println(lista.lastIndexOf("tres"));
        System.out.println(lista.lastIndexOf("dos"));

        /*Object clone()
         * Permite realizar el clone de un ArrayList
         */
        ArrayList<String> doble;

        doble=(ArrayList<String>) lista.clone();
        System.out.println(lista);
        System.out.println(doble);

        lista.add("tres");
        doble.add(0, "cero");
        System.out.println(lista);
        System.out.println(doble);

        /*boolean contains(Object o)
         * Devuelve TRUE si el objeto pasado por el parametro existe
         */
        
         System.out.println(lista.contains("cero"));

         /*
          * E remove (int index)
          Elimina el elemento que ocupa la posicion pasada por el parametro
          */
          doble.remove(2);
          System.out.println(doble);

          //Elimina la primera ocurrencia el elemento pasado por parámetro
          System.out.println(lista);
          System.out.println(doble);
          
          /*E set(int index, E element) Reemplaza el elemento pasado  */
          

    }
    
}
