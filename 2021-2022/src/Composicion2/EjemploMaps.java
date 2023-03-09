package Composicion2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploMaps {

	public static void main(String[] args) {
		
		System.out.println("**************HashMap**************");
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");
		map.put(3, "Pepe");
		map.put(6, "Gonoba");
		map.put(9, "Iniesta");
		map.put(15, "Navas");
		map.put(19, "Pujol");
		map.put(21, "Nigero");
		map.put(41, "Poppin");
		
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println("Clave " +key+ " -> Valor: "+ map.get(key));
		}
		
		System.out.println();
		
		System.out.println("**************TreeMp**************");
		Map<Integer, String> tree = new TreeMap<Integer, String>();
		tree.put(1, "Casillas");
		tree.put(3, "Pepe");
		tree.put(6, "Gonoba");
		tree.put(19, "Iniesta");
		tree.put(77, "Navas");
		tree.put(23, "Pujol");
		tree.put(21, "Nigero");
		tree.put(5, "Poppin");
		
		Iterator<Integer> ity = tree.keySet().iterator();
		
		while(ity.hasNext()) {
			Integer key=ity.next();
			System.out.println("Clave " +key+ " -> Valor: "+ tree.get(key));
		}
		System.out.println();
		
		
		System.out.println("**************LinkedHasMap**************");
		Map<Integer, String> linked = new LinkedHashMap<Integer, String>();
		linked.put(1, "Casillas");
		linked.put(3, "Pepe");
		linked.put(6, "Gonoba");
		linked.put(19, "Iniesta");
		linked.put(77, "Navas");
		linked.put(23, "Pujol");
		linked.put(21, "Nigero");
		linked.put(5, "Poppin");
		
		
		Iterator<Integer> ito = linked.keySet().iterator();
		while(ito.hasNext()) {
			Integer key=ito.next();
			System.out.println("Clave " +key+ " -> Valor: "+ linked.get(key));
		}
		System.out.println();
		
		
	}
	
}
