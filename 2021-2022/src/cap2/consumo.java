package cap2;

import java.util.Scanner;

/*Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes
características:
Atributos:
kms. Kilómetros recorridos por el coche,
litros. Litros de combustible consumido,
vmed. Velocidad media,
pgas. Precio de la gasolina.
Métodos:
getTiempo. Indicará el tiempo empleado en realizar el viaje.
consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros).
consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más
apropiado para cada atributo.*/

public class consumo {

	// Atributos:
	double kms; // Kilómetros recorridos por el coche,
	double litros;// Litros de combustible consumido,
	double vmed; // Velocidad media,
	double pgas; // Precio de la gasolina.

	public consumo( consumo cen   ) {
		this.kms=      cen.getKms();
		this.litros=   cen.getLitros();
		this.vmed=     cen.getVmed();
		this.pgas=     cen.getPgas();
	}
	 //constructor alternativo que ya pide los datos
	public consumo() {
		/*/this.kms=      cen.getKms();
		this.litros=   cen.getLitros();
		this.vmed=     cen.getVmed();
		this.pgas=     cen.getPgas();*/
		consumo.pideInfo();
	}
	
	public consumo(double kms, double litros, double vmed, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

	public static consumo pideInfo() {
		consumo c;
		double k,l,v,p;
		Scanner es = new Scanner(System.in);
		System.out.println("mete datos del viaje\n");
		System.out.println("kilometros recorridos (km): ");
		k=es.nextDouble();
		System.out.println("litros consumidos (l): ");
		l=es.nextDouble();
		System.out.println("velocidad promedio (km/h): ");
		v=es.nextDouble();
		System.out.println("precio litro (€): ");
		p=es.nextDouble();
		System.out.println();
		c=new consumo(k, l, v, p);
		return c;
	}
	
	public double getKms() {
		return kms;
	}
	public double getLitros() {
		return litros;
	}
	public double getVmed() {
		return vmed;
	}
	public double getPgas() {
		return pgas;
	}
	
	@Override
	public String toString() {
		return "consumo [kms= " + kms + ", litros= " + litros 
				+ ", vmed= " + vmed + ", pgas= " + pgas + "]";
	}
	
	public String dameInfo() {
		return " getTiempo()= "+ getTiempo() + " horas\n consumoMedio()= "
				+ consumoMedio() + " l/100k \n consumoEuros()= " 
				+ consumoEuros() + " €/100k]";
		
	}
	// Métodos:
	public double getTiempo() {
		return kms / vmed; // 360 (km)/ 120 (km/h) ----> 3 horas
	} // Indicará el tiempo empleado en realizar el viaje.

	public double consumoMedio() {
		 return litros*100/kms;     // litros   /  (kms/100)
	}   // Consumo medio del vehiculo (en litros cada 100 kilómetros).
		
	public double consumoEuros() {
		return pgas*consumoMedio();
	}  // Consumo medio del vehiculo (en euros cada 100 kilómetros).
		
		
		
	
}