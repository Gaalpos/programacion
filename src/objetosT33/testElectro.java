package objetosT33;


import objetosT33.Electrodomestico.Color;
import objetosT33.Electrodomestico.Consumo;

public class testElectro {

	public static void main(String[] args) {
		float total=0;
		float electro=0;
		float teles=0;
		float lavadoras=0;

		Electrodomestico uno = new Electrodomestico(300, 23, Consumo.C, Color.ROJO);
		//System.out.println(uno.precioFinal());

		Lavadora dos = new Lavadora(200, 12, Consumo.D, Color.AZUL, 8);
		//System.out.println(dos.precioFinal());

		Television tres = new Television(500, 4, Consumo.A, Color.NEGRO, 44, true);
		//System.out.println(tres.precioFinal());
		Electrodomestico cuatro = new Electrodomestico(300, 23, Consumo.C, Color.ROJO);
		//System.out.println(uno.precioFinal());

		Lavadora cinco = new Lavadora(200, 12, Consumo.D, Color.AZUL, 8);
		//System.out.println(dos.precioFinal());

		Television seis = new Television(500, 4, Consumo.A, Color.NEGRO, 44, true);
		//System.out.println(tres.precioFinal());

		Electrodomestico siete = new Electrodomestico(300, 23, Consumo.C, Color.ROJO);
		//System.out.println(uno.precioFinal());

		Lavadora ocho = new Lavadora(200, 12, Consumo.D, Color.AZUL, 8);
		//System.out.println(dos.precioFinal());

		Television nueve = new Television(500, 4, Consumo.A, Color.NEGRO, 44, true);
		//System.out.println(tres.precioFinal());


		// crear array de Electrodomesticos de 10 posiciones
		Electrodomestico[] varios = { uno, dos, tres,tres,cuatro,cinco,seis,siete,ocho,nueve };

		for (Electrodomestico e : varios) {
			// mostrar
			System.out.println(e.toString());
			System.out.println(e.precioFinal());
			total+=e.precioFinal();
			
			if(e instanceof Lavadora)
				lavadoras+=e.precioFinal();
			
			if(e instanceof Television)
				teles+=e.precioFinal();
			if(e instanceof Electrodomestico)
				electro+=e.precioFinal();
			
		}
		System.out.println("gasto en eletrodomesticos: "+total);
		System.out.println("gasto en televisiones: "+teles);
		System.out.println("gasto en lavadoras: "+lavadoras);
		System.out.println("gasto en otros electrodomesticos: "+electro);
		//
	}

}
