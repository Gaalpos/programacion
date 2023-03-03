package vehiculos;

import java.util.ArrayList;

import objetosT3.Electrodomestico.Color;

public class testVehiculo {
	
	public static void main(String[] args) {

		
		//me puede interesart vehiculo si invoco metodos de las clases organizadas en herencia
		float pagarImpuestos=0f;
		float pagarSeguro=0f;
		float pagarITV=0f;
		ArrayList<Pagable> lista = new ArrayList <>();
		
		Coche Opel = new Coche(Color.AZUL, (byte)4, (short)125,(short) 98, (byte)5);
		Motocicleta Ducati = new Motocicleta(Color.BLANCO, (short)125, (short)24);
		Camion Man = new Camion(Color.ROJO, (byte)18, (byte)4, (short)215, (short)445);
		

		lista.add(Opel);
		lista.add(Ducati);
		lista.add(Man);
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).toString());
			System.out.println("pagará:  " +lista.get(i).impuesto());
			System.out.println();
			pagarImpuestos+=lista.get(i).impuesto();
		}
		System.out.println();
		System.out.println("total a pagar de impuestos: "+pagarImpuestos);
		System.out.println();
		
		//-------------------------------------------------------------------
		
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).toString());
			System.out.println("pagará:  " +lista.get(i).seguro());
			pagarSeguro+=lista.get(i).seguro();
		}
		System.out.println();
		System.out.println("total a pagar de seguro: "+pagarSeguro);
		System.out.println();
		
		//-------------------------------------------------------------------
		
		
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).toString());
			System.out.println("pagará:  " +lista.get(i).itv());
			pagarITV+=lista.get(i).itv();
		}
		System.out.println();
		System.out.println("total a pagar de ITV: "+pagarITV);
		System.out.println();
		
	}
}
