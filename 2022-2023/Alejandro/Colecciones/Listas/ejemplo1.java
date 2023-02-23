package Colecciones.Listas;

import java.util.ArrayList;

public class ejemplo1 {
    

    public static void main(String[] args) {
        
        //Constructores
        ArrayList<String> lista= new ArrayList<String>();
        //Constructor con size
        ArrayList<String> otra= new ArrayList<String>(12);

        //void add(int index, E element)

        lista.add("uno");
        lista.add(1, "dos");
        System.out.println(lista);

        otra.add("uno");
        otra.add(0, "dos");
        System.out.println(otra);


        //void clear()
        otra.clear();
        System.out.println(otra);

        //Devuelve true si el array esta vacio
System.out.println(otra.isEmpty());

System.out.println(lista.get(1));

//Devuelve la ultima ocurrencia del elemento
System.out.println(lista.lastIndexOf("tres"));
System.out.println(lista.lastIndexOf("dos"));


//Permite realizar el clone de un ArrayList
ArrayList<String> doble;

doble= (ArrayList<String>) lista.clone();
System.out.println(lista);
System.out.println(doble);

lista.add("tres");
doble.add(0, "cero");
System.out.println(lista);
System.out.println(doble);


//Devuelve true si el objeto pasado por parametro existe
System.out.println(lista.contains("cero"));

//Elimina el elemneto que ocupa la posicion pasada por el parametro
doble.remove(2);
System.out.println(doble);

//elimina la primera ocurrencia del elemento pasado por parametro

System.out.println(doble.remove("cero"));
System.out.println(doble);


lista.set(0, "ochomil");
System.out.println(lista);





    }
}
