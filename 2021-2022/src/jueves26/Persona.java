package jueves26;

import java.util.Random;
import java.util.Scanner;

public class Persona implements Comparable{

	private final int NODISP=5;
	private final int INFRA = -1;
	private final int NORM = 0;
	private final int SOBRE = 1;

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo; // (H hombre, M mujer),
	private int peso; // kg
	private double altura; // m
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Persona() {
		this.sexo = 'H';
		this.DNI = generaDNI();
	}

	public Persona(String n, int e, char s) {
		this.nombre = n;
		this.edad = e;
		this.sexo = compruebaSexo(s);
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

	// auxiliar y subido
	static char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public static int divideDNI(Integer d) {
		return (int) (d % 23);
	}

	public static char obtenerLetra(int m) {
		return letra[m];
	}

	public int calcularIMC() {

		if (altura != 0) {
			double cuenta = peso / Math.pow(altura, 2);
			System.out.println(cuenta);

			if (cuenta < 20)
				return INFRA;
			else if (cuenta >= 20 && cuenta <= 25)
				return NORM;
			else
				return SOBRE;
		} else
			return NODISP;
	}

	public boolean esMayorDeEdad() {
		if (edad >= 18)
			return true;
		else
			return false;
	}

	/*
	 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
	 * no es correcto, sera H. No sera visible al exterior.
	 */
	private char compruebaSexo(char s) {
		if (s == 'H' || s == 'M')
			return s;
		else
			return 'H';
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	public static Persona pideDatos() {
        Scanner scan = new Scanner(System.in);  
        System.out.println("nombre ");
        String n=scan.nextLine();
        System.out.println("edad ");
        int e= scan.nextInt();
        System.out.println("sexo H/M ");
        char s=scan.next().charAt(0);
        System.out.println("peso kg ");
        int p=scan.nextInt();
        System.out.println("altura m ");
        double a=scan.nextDouble();
       
        return new Persona(n, e, s, p, a);
    }
	
	public int compareTo(Object o) {
		Persona p = (Persona ) o;
		return (this.nombre).compareTo(p.nombre);
	}

}