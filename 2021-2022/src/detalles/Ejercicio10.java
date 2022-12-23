package detalles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Ejercicio 10
//Crea un mini-diccionario español-inglés que contenga, al menos, 
//20 palabras (con su correspondiente traducción). Utiliza un objeto 
//de la clase HashMap para almacenar las parejas de palabras. 
//El programa pedirá una palabra en español y dará la correspondiente 
//traducción en inglés.

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> diccionario = new HashMap<String, String>();
		
		diccionario.put("Naranja", "Orange");
		diccionario.put("Manzana", "Apple");
		diccionario.put("Cereza", "Cherry");
		diccionario.put("Pera","Pear");
		diccionario.put("Limon", "Lemon");
		diccionario.put("Platano", "Banana");
		diccionario.put("Castaña", "Chestnut");
		diccionario.put("Melocoton", "Peach");
		diccionario.put("Cacahuete", "Peanut");
		diccionario.put("Berenjena", "Eggplant");
		diccionario.put("Tomate", "Tomato");
		diccionario.put("Lechuga", "Lettuce");
		diccionario.put("Patata", "Potato");
		diccionario.put("Batata","Sweet Potato");
		diccionario.put("Guisante", "Pea");
		diccionario.put("Avellana", "Hazelnut");
		diccionario.put("Nuez", "Walnut");
		diccionario.put("Aguacate", "Avocado");
		diccionario.put("Zanahoria", "Carrot");
		diccionario.put("Cebolla", "Onion");
		
		System.out.println("Introduce una palabra en español: ");
		String codigo = sc.nextLine();
		if(diccionario.containsKey(codigo)) {
			System.out.println(codigo+" en ingles es: ");
			System.out.println(diccionario.get(codigo));
		}else {
			System.out.println("La palabra introducida no existe");
		}
		
	}
}