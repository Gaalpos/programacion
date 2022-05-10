package vehiculos;

import objetosT3.Electrodomestico.Color;

public  class Vehiculo {

	private Color color;
	private byte numRuedas;
	private short cilindrada;
	private short potencia;

	Vehiculo(Color color) {
		setColorVehiculo(color);
	}

	Vehiculo(byte nRuedas) {
		this.numRuedas = nRuedas;
	}

	Vehiculo(short cilindrada) {
		this.cilindrada = cilindrada;
	}

	Vehiculo(Color color, byte nRuedas) {
		this(color);
		this.numRuedas = nRuedas;
	}

	Vehiculo(Color color, byte nRuedas, short cilindrada) {
		this(color, nRuedas);
		this.cilindrada = cilindrada;
	}

	Vehiculo(Color color, byte nRuedas, short cilindrada, short potencia) {
		this(color, nRuedas, cilindrada);
		this.potencia = potencia;
	}

	// get se4t
	public Color getColorVehiculo() {
		return color;
	}

	public void setColorVehiculo(Color colorVehiculo) {
		color = colorVehiculo;
	}

	public byte getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(byte nRuedas) {
		numRuedas = nRuedas;
	}

	public short getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		this.cilindrada = cilindrada;
	}

	public short getPotencia() {
		return potencia;
	}

	public void setPotencia(short potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", numRuedas=" + numRuedas + ", cilindrada=" + cilindrada + ", potencia="
				+ potencia + "]";
	}
	
	public  void arrancar() {
		System.out.println("arracnamos con licencia especial C");
	}

	
	public void rellenarDeposito() {
		System.out.println("meterle 20 euros");
	}
}
