package vehiculos;

import objetosT3.Electrodomestico.Color;

public class Motocicleta extends Vehiculo implements Pagable{

	
	private byte NumeroDePlazas;
	
	Motocicleta() {
	 super((byte)2);
	 }
	
	 Motocicleta(byte NumeroDePlazas) {
	 super((byte)2);
	 setNumeroDePlazas(NumeroDePlazas);
	 }
	
	 Motocicleta(Color color) {
	 super(color,(byte)2);
	 }
	
	 Motocicleta(Color color, short Cilindrada) {
	 super(color,(byte)2,Cilindrada);
	 }
	
	 Motocicleta(Color color, short Cilindrada,
	 short Potencia) {
	 super(color,(byte)2,Cilindrada,Potencia);
	 }

	public byte getNumeroDePlazas() {
		return NumeroDePlazas;
	}

	public void setNumeroDePlazas(byte numeroDePlazas) {
		NumeroDePlazas = numeroDePlazas;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Motocicleta [NumeroDePlazas=" + NumeroDePlazas + "]";
	}
	
	public  void arrancar() {
		System.out.println("arracnamos con licencia especial A");
	}
	
	public void rellenarDeposito() {
		System.out.println("meterle 20 euros");
	}

	public void hacerCaballitos() {
		System.out.println(" -3 puntos de carnet");
	}
	public void candar() {
		System.out.println("poner antirrobo rueda");
	}

	@Override
	public float impuesto() {
		// TODO Auto-generated method stub
		return (super.getCilindrada()/30 +super.getPotencia()*30);
	}

	@Override
	public float seguro() {
		// TODO Auto-generated method stub
		return 10*super.getPotencia();
	}

	@Override
	public float itv() {
		// TODO Auto-generated method stub
		return (100*IVA_DEFECTO)*(2*super.getCilindrada()/100);
	}
}
