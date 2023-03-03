package objetosT3;

import java.util.Random;


public class Persona {
	private final int NODISP=5;
	private final int INFRA=-1;
	private final int NORMAL=0;
	private final int SOBRE=1;
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private int peso;
	private double altura;

	public Persona() {
		this.sexo = 'H';
		this.DNI = generaDNI();
	}

	public Persona(String n, int e, char s) {
		this.nombre = n;
		this.edad = e;
		this.sexo = compruebaSexo(sexo);
		this.DNI = generaDNI();
	}

	public Persona(String nombre, int edad, char sexo, int peso, double altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = compruebaSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	private String generaDNI() {
		Random r = new Random();

		Integer cifras = r.nextInt(99999999 - 9999999 + 1) + 9999999;
		String cadena = "";
		cadena = String.valueOf(cifras);
		cadena += obtenerLetra(divideDNI(cifras));

		return cadena;

	}

	static char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public static int divideDNI(Integer d) {
		return (int) (d % 23);
	}

	public static char obtenerLetra(int m) {
		return letra[m];
	}

	public int calcularIMC() {
		
		if(altura !=0) {
		
		double cuenta=this.peso/Math.pow(altura, 2);
		System.out.println();
		if(cuenta<20)
			return INFRA;
		else if(cuenta>=20 && cuenta<=25)
			return NORMAL;
		else 
			return SOBRE;
		}else
			return NODISP;
	}

	public boolean esMayorDeEdad() {
		if(edad>=18)
			return true;
		else
			return false;
	}
	
	private char compruebaSexo(char s) {
		if(s=='H' || s=='M')
			return s;
		else
			return 'H';
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}






