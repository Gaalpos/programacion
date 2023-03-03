package objetosT3;

import objetosT3.ElectrodomesticoG.Color;
import objetosT3.ElectrodomesticoG.Consumo;

public class testElectro {

	public static void main(String[] args) {

		ElectrodomesticoG uno = new ElectrodomesticoG(300, 23, Consumo.C, Color.ROJO);
		//System.out.println(uno.precioFinal());

		Lavadora dos = new Lavadora(200, 12, Consumo.D, Color.AZUL, 8);
		//System.out.println(dos.precioFinal());

		Television tres = new Television(500, 4, Consumo.A, Color.NEGRO, 44, true);
		//System.out.println(tres.precioFinal());

		// crear array de Electrodomesticos de 10 posiciones
		ElectrodomesticoG[] varios = { uno, dos, tres };

		for (ElectrodomesticoG e : varios) {
			// mostrar
			System.out.println(e.toString());
			System.out.println(e.precioFinal());
		}
		
		//
		

	}

}
