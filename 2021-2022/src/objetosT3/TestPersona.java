package objetosT3;

import java.util.Scanner;

public class TestPersona {

	public static Persona pideDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("nombre: ");
		String n = sc.nextLine();

		System.out.println("edad: ");
		int e = sc.nextInt();

		System.out.println("sexo H/M: ");
		char s = sc.next().charAt(0);

		System.out.println("peso kg: ");
		int p = sc.nextInt();
		
		System.out.println("altura en metros: ");
		double a = sc.nextDouble();

		return new Persona(n, e, s, p, a);
	}

	public static void main(String[] args) {

		Persona uno = pideDatos();
		System.out.println(uno.toString());
		System.out.println(uno.calcularIMC());
		System.out.println(uno.esMayorDeEdad());
		
		Persona dos = pideDatos();
		System.out.println(dos.toString());
		System.out.println(dos.calcularIMC());
		System.out.println(dos.esMayorDeEdad());
		
		Persona tres = new Persona ("Lukas",16,'M');
		System.out.println(tres.toString());
		System.out.println(tres.calcularIMC());
		System.out.println(tres.esMayorDeEdad());
	}

}
