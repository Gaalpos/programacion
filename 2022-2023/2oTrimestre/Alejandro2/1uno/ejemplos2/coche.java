package ejemplos2;

public class coche extends Object{

	
//ATRIBUTOS
int numero_ruedas;
String color;
String marca;
String modelo;
int numero_de_puertas;
double consumo;
int potencia;
//constructor sin parametros
public coche() {}

//Constructor con todos los parametros
public coche(int numero_ruedas, String color, String marca, String modelo, int numero_de_puertas, double consumo,
		int potencia) {
	this.numero_ruedas = numero_ruedas;
	this.color = color;
	this.marca = marca;
	this.modelo = modelo;
	this.numero_de_puertas = numero_de_puertas;
	this.consumo = consumo;
	this.potencia = potencia;
}

//metodos

public void arrancar() {
System.out.println("esta arrancando");
}

public void frenar() {
System.out.println("clavamos freno");
}
public void acelerar() {
System.out.println("dalle ghas blas");
}
public void acelerar(int c) {
	System.out.println("has acelerado "+c);
}

public void pasarITV () {
System.out.println("rezar mucho");
}



	@Override
public String toString() {
	return "coche [numero_ruedas=" + numero_ruedas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
			+ ", numero_de_puertas=" + numero_de_puertas + ", consumo=" + consumo + ", potencia=" + potencia + "]";
	}	public static void main(String[] args) {
		coche feo = new coche(4, "marron", "ni_se_sabe", "antiguo", 2, 7.32, 14);
		coche molon= new coche(7, "azul palido", "ACME", "mark3", 1, 0.34, 3200);
		feo.acelerar();
		feo.arrancar();
		feo.frenar();
		feo.pasarITV();
		System.out.println(feo.equals(molon));
		System.out.println(feo.toString());
		System.out.println(molon.toString());
		feo.color="dorado que lo flipas";
		System.out.println(feo);}

	
	}







