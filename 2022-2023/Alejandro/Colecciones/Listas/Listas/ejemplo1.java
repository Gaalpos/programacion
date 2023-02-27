package Colecciones.Listas.Listas;

import java.util.ArrayList;

public class ejemplo1 {
    

    public static void main(String[] args) {
		
		//constructores
		ArrayList<String> lista = new ArrayList<String>();
		//constructor con size
		ArrayList<String> otra = new ArrayList<>(12);
		
		
		//void add(int index, E element) añadir
		
		lista.add("uno");
		lista.add(1,"dos");
		System.out.println(lista);
		
		otra.add("uno");
		otra.add(0,"dos");
		System.out.println(otra);
		
		//void clear()	Permite limpiar un ArraList
		otra.clear();
		System.out.println(otra);
		
		//boolean isEmpty() 		Devuelve TRUE si el ArrayList esta vacío
		System.out.println(otra.isEmpty());
		
		//E get(int index) 		Obtiene el elemento de la posición pasada por parámetro
		System.out.println(lista.get(1));
		
		/*int lastIndexOf(Object o)
		Devuelve el indíce de la última ocurrencia del elemento. Si el elemento no se encuentra devuelve -1.
		*/
		
		System.out.println(lista.lastIndexOf("tres"));
		
		System.out.println(lista.lastIndexOf("dos"));
		
		/*Object clone()
		Permite realizar el clone de un ArrayList*/
		ArrayList<String> doble;
		
		doble= (ArrayList<String>) lista.clone();
		System.out.println(lista);
		System.out.println(doble);
		
		lista.add("tres");
		doble.add(0, "cero");
		System.out.println(lista);
		System.out.println(doble);
		
		
		/*boolean contains(Object o)
		Devuelve TRUE si el objeto pasado por parámetro existe*/
		
		System.out.println(lista.contains("cero"));
		
		
		/*E remove(int index)
		Elimina el elemento que ocupa la posición pasada por parámetro.
		*/
		doble.remove(2);
		System.out.println(doble);
		
		/*boolean remove(Object o)
		Elimina la primera ocurrencia el elemento pasado por parámetro.*/
		System.out.println(doble.remove("cero"));
		System.out.println(doble);
		
		
		/*E set(int index, E element)	Reemplaza el elemento pasado por parámetro en la posición indicada.*/
		
		lista.set(0, "ochomil");
		System.out.println(lista);
		
	}
}
