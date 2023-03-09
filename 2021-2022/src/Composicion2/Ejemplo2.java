package Composicion2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejemplo2 {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		
		map.put(231,"Pedor");
		map.put(343, "Javi");
		map.put(336, "Jose");
		map.put(349, "Maria");
		map.put(153, "Josefa");
		
		System.out.println("Los elementos de map son \n"+map);
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("Clave " +key+ " -> Valor: "+ map.get(key));
		}
	}

}
