package viernes27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ejercicio12 {

	public static List<CartaN> darMano(){
		
	
	CartaN nueva;
	List <CartaN> mano= new ArrayList<CartaN>();
	
	do {
		nueva = new CartaN();
		if(!mano.contains(nueva)) {
			mano.add(nueva);
		}
	}while(mano.size()<5);
	
	Collections.sort(mano);
	for(CartaN carta:mano)
		System.out.println(carta);
	return mano;
	
	}
	
	static HashMap<String,Integer>puntos= new HashMap<>();
	static void puntosBrisca(){
		puntos.put("AS", 11);
		puntos.put("TRES", 10);
		puntos.put("REY", 4);
		puntos.put("CABALLO", 3);
		puntos.put("SOTA", 2);
		puntos.put("SIETE", 1);
		puntos.put("SEIS", 0);
		puntos.put("CINCO", 0);
		puntos.put("CUATRO", 0);
		puntos.put("DOS", 0);
		puntos.put("SEIS", 0);
		
	}
	
	public static String darPuntuacion(List<CartaN> j) {
		
		int tanteo=0;
		
		for (CartaN c:j) {
			tanteo+=puntos.get(c.getValor());
		}
		
		return "TUS PUNTOS SON: "+tanteo;
		
	}
	
	public static void main(String[] args) {
		
		puntosBrisca();
		List<CartaN> jugada = darMano();
		System.out.println(darPuntuacion(jugada));
	
		
	}
}
