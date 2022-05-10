package vehiculos;

import objetosT3.Electrodomestico.Color;

public class Camion extends Vehiculo implements Pagable{

	private byte NumeroDeEjes;

	Camion(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
	}

	Camion(Color color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		setNumeroDeEjes(NumeroDeEjes);
	}

	public byte getNumeroDeEjes() {
		return NumeroDeEjes;
	}

	public void setNumeroDeEjes(byte numeroDeEjes) {
		NumeroDeEjes = numeroDeEjes;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Camion [NumeroDeEjes=" + NumeroDeEjes + "]";
	}
	
	public  void arrancar() {
		System.out.println("arracnamos con licencia especial A");
	}
	
	public void rellenarDeposito() {
		System.out.println("meterle 20 euros");
	}

	public void acoplarTrailer() {
		System.out.println(" trailer acoplado");
	}
	
	public void descargar() {
		System.out.println("sacando el pescado");
	}

	@Override
	public float impuesto() {
		// TODO Auto-generated method stub
		return (super.getCilindrada()/30 + super.getPotencia()*20+ super.getNumRuedas()*20 + getNumeroDeEjes());
	}

	@Override
	public float seguro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float itv() {
		// TODO Auto-generated method stub
		return 0;
	}
}