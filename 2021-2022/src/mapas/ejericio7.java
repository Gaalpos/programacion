package mapas;

import java.util.ArrayList;

/*
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón siguiendo la siguiente pauta: 
 * o bien coincide el valor con la moneda anteriormente generada - 
 * 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro o 2 euros - 
 * o bien coincide la posición – cara o cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta.
 *  Cada moneda generada debe ser una instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista. 

Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara

 */

public class ejericio7 {
	
	public static void main(String[] args) {
	
		/*
		for(int i=0; i<20;i++) {
			Moneda m = new Moneda();
			System.out.println(m);
		}
		
		*/
		
		ArrayList<Moneda> poket = new ArrayList <Moneda>();
		
		Moneda uno = new Moneda();
		poket.add(uno);
		
		System.out.println(poket);
		Moneda NUEVA;
		
		do {
			NUEVA=new Moneda();
			System.out.println(NUEVA);
			
			if(NUEVA.anverso.equals(uno.anverso) || NUEVA.reverso.equals(uno.reverso));
			poket.add(NUEVA);
			uno=NUEVA;
		}while(poket.size()<7);
		
		for(Moneda m:poket) {
			System.out.println(m);
		}
	}

}
