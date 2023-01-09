package resueltos;

import java.util.Scanner;

/*9. Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes
características:
Atributos:
kms. Kilómetros recorridos por el coche, ---> double
litros. Litros de combustible consumido,----> double
vmed. Velocidad media,----->double
pgas. Precio de la gasolina.----->double
Métodos:
getTiempo. Indicará el tiempo empleado en realizar el viaje.
consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros).
consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más
apropiado para cada atributo.*/

public class consumo {

//Atributos
	
	//kms. Kilómetros recorridos por el coche, ---> 
	double kms;
	//litros. Litros de combustible consumido,---->
	double litros;
	//vmed. Velocidad media,----->
	double vmed;
	//pgas. Precio de la gasolina.----->
	double pgas;
	
	
	public double getKms() {
		return kms;
	}


	public void setKms(double kms) {
		this.kms = kms;
	}


	public double getLitros() {
		return litros;
	}


	public void setLitros(double litros) {
		this.litros = litros;
	}


	public double getVmed() {
		return vmed;
	}


	public void setVmed(double vmed) {
		this.vmed = vmed;
	}


	public double getPgas() {
		return pgas;
	}


	public void setPgas(double pgas) {
		this.pgas = pgas;
	}


	consumo(double k,double l, double v,double p){
		this.kms=k;
		this.litros=l;
		this.vmed=v;
		this.pgas=p;
		
	}


	@Override
	public String toString() {
		return "consumo [kms=" + kms + ", litros=" + litros + ", vmed=" + vmed + ", pgas=" + pgas + "]";
	}
	
	
	//getTiempo(No es un getter). Indicará el tiempo empleado en realizar el viaje.
	public double tiempo() {
		double aux=0;
		aux= kms/vmed;
		return aux;
	}
	
	//consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros).
	public String consumoMedio() {
		double cuenta= (litros/kms)*100;
		String aux="El consumo es: "+cuenta+" en litros cada 100 kms";
		return aux;
		
	}
	
	//consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
	public String consumoEuros() {
		double cuenta= (litros*pgas/kms)*100;
		String aux="El coste es : "+cuenta+" en euros cada 100 kms";
		return aux;
		
	}
	
	
	public static void main(String[] args) {
		double k,l,v,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos kilometros has recorrido? ");
		k=sc.nextDouble();
		System.out.println("Cuántos litros has consumido? ");
		l=sc.nextDouble();
		System.out.println("Cual ha sido la velocidad media? ");
		v=sc.nextDouble();
		System.out.println("Dime precio: ");
		p=sc.nextDouble();
		
		consumo c= new consumo(k,l,v,p);
		System.out.println(c.toString());
	
		//Metodo tiempo
		System.out.println("El tiempo del viaje es: "+c.tiempo()+" horas");
		
		//Metodo consumo medio cada 100 kms
		System.out.println(c.consumoMedio());
		
		//Metodo consumo en euros cada 100kms
		System.out.println(c.consumoEuros());
		
		
		
		
		
	}
	
	
	
	
	
}
