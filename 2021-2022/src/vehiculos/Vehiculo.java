package vehiculos;

import java.util.Random;

import objetosT3.Electrodomestico.Color;

public class Vehiculo {

	private String matricula;
	private Color color;
	private byte numRuedas;
	private short cilindrada;
	private short potencia;
	
	
	

	Vehiculo(Color color) {
		this.matricula=generaMatricula();
		setColorVehiculo(color);
	}

	Vehiculo(byte nRuedas) {
		this.matricula=generaMatricula();
		this.numRuedas = nRuedas;
	}

	Vehiculo(short cilindrada) {
		this.matricula=generaMatricula();
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
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", numRuedas=" + numRuedas + ", cilindrada="
				+ cilindrada + ", potencia=" + potencia + "]";
	}

	public  void arrancar() {
		System.out.println("arracnamos con licencia especial C");
	}

	
	public void rellenarDeposito() {
		System.out.println("meterle 20 euros");
	}
	
	//ejercicio para generar una matricula de 4 digitios y 3 letras
	private static String generaMatricula()
	  {
	    //Letras válidas para matrícula
	    char[] array = {'B', 'C',
	                    'D', 'F', 'G', 'H', 'J', 'K', 'L', 
	                    'M', 'N', 'P', 'R', 'S', 'T', 'V', 
	                    'W', 'X', 'Y', 'Z'};

	    String matricula = "";

	    for (int i=0; i<7; i++){
	      Random rnd = new Random();
	      int ale = (int)(rnd.nextDouble() * array.length); //Aleatorio para la letra
	      int ale2 = (int)(rnd.nextDouble() * 10); //Aleatorio entre 0-9
	      if (i>3) {
	        matricula += array[ale];
	      } else {
	        matricula +=  ale2;
	      }
	    }

	    return matricula;

	  }
	
	
}
