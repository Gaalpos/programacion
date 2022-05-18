package Composicion2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ejemploMaps2 {

	public static void main(String[] args) {

		System.out.println("**************HashMap**************");
		
		
		Map<Integer, JugadorSeleccion> map = new HashMap<Integer, JugadorSeleccion>();
		
		
		JugadorSeleccion js1 = new JugadorSeleccion(1,"Casillas", "portero"); 
		JugadorSeleccion js2 = new JugadorSeleccion(2,"navas", "defensa");
		JugadorSeleccion js3 = new JugadorSeleccion(4,"iniesta", "defensa");
		JugadorSeleccion js4 = new JugadorSeleccion(6,"Messi", "delantero");
		JugadorSeleccion js5 = new JugadorSeleccion(9,"Ronaldo", "medio");
		map.put(1,js1);
		map.put(3, js2);
		map.put(6, js3);
		map.put(9, js4);
		map.put(15, js5);
		
		
		
		
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println("Clave " +key+ " -> Valor: "+ map.get(key));
		}
		
		System.out.println();
		
	}
	
	
	
}
