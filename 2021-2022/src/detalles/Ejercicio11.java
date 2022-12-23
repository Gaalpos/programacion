package detalles;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * ***Ejercicio 11
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. 
El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas. 
Al final, el programa deberá mostrar cuántas respuestas son válidas y cuántas erróneas.

 */

public class Ejercicio11 {
	 static  Map<String, String> diccionario;
	public static void funcional(){

	
		diccionario = new HashMap<String, String>();

		diccionario.put("Naranja", "Orange");
		diccionario.put("Manzana", "Apple");
		diccionario.put("Cereza", "Cherry");
		diccionario.put("Pera", "Pear");
		diccionario.put("Limon", "Lemon");
		diccionario.put("Platano", "Banana");
		diccionario.put("Castaña", "Chestnut");
		diccionario.put("Melocoton", "Peach");
		diccionario.put("Cacahuete", "Peanut");
		diccionario.put("Berenjena", "Eggplant");
		diccionario.put("Tomate", "Tomato");
		diccionario.put("Lechuga", "Lettuce");
		diccionario.put("Patata", "Potato");
		diccionario.put("Batata", "Sweet Potato");
		diccionario.put("Guisante", "Pea");
		diccionario.put("Avellana", "Hazelnut");
		diccionario.put("Nuez", "Walnut");
		diccionario.put("Aguacate", "Avocado");
		diccionario.put("Zanahoria", "Carrot");
		diccionario.put("Cebolla", "Onion");
	}
	
	public static void main(String[] args) {
		funcional();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(diccionario.size());
		
		Random r= new Random();
		int p = 0+r.nextInt(diccionario.size()-1);
		System.out.println(p);
		System.out.println(diccionario.get(p));
		String []palabras= diccionario.values().toArray(new String [0]);
		System.out.println(palabras[p]);
				
		String trad=sc.nextLine();	
		if(trad.equals(palabras[p]))
			System.out.println("Bien");
		else
			System.out.println("Mal");
	
	
	}
}
