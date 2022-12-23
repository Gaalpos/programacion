package vehiculos;

import objetosT3.Electrodomestico.Color;

public class Coche extends Vehiculo implements Pagable  {
	
	byte numPuertas;

	public Coche(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Coche(byte nRuedas) {
		super(nRuedas);
		// TODO Auto-generated constructor stub
	}

	public Coche(short cilindrada) {
		super(cilindrada);
		// TODO Auto-generated constructor stub
	}

	public Coche(Color color, byte nRuedas) {
		super(color, nRuedas);
		// TODO Auto-generated constructor stub
	}

	public Coche(Color color, byte nRuedas, short cilindrada) {
		super(color, nRuedas, cilindrada);
		// TODO Auto-generated constructor stub
	}

	public Coche(Color color, byte nRuedas, short cilindrada, short potencia) {
		super(color, nRuedas, cilindrada, potencia);
		// TODO Auto-generated constructor stub
	}

	public Coche(Color color, byte nRuedas, short cilindrada, short potencia, byte np) {
		super(color, nRuedas, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		setNumPuertas(np);
	}

	public byte getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(byte numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + "]";
	}
	
	public  void arrancar() {
		System.out.println("arracnamos con licencia especial B");
	}
	
	public void rellenarDeposito() {
		System.out.println("meterle 70 euros");
	}
	
	public void lavar() {
		System.out.println("le das con la manguerita");
	}
	
	public void asegurarMenores() {
		System.out.println(" niño ponte bien el cinturón");
	}

	@Override
	public float impuesto() {
		// TODO Auto-generated method stub
		return (super.getCilindrada()/30 + super.getPotencia()*20+ super.getNumRuedas()*20 + getNumPuertas());
	}

	@Override
	public float seguro() {
		// TODO Auto-generated method stub
		return 15*super.getPotencia();
	}

	@Override
	public float itv() {
		// TODO Auto-generated method stub
		return (100*IVA_DEFECTO)*(3*super.getCilindrada()/100);
	}
	/*
	 * return (super.getCilindrada()/30 + super.getPotencia()*20+ super.getNumRuedas()*20 + getNumeroDeEjes());
	 */
}
