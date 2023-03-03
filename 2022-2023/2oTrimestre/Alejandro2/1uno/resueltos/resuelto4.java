package resueltos;

import java.util.Scanner;

public class resuelto4 {
/*Verdadero. Si la edad es menor o igual a 28, el nivel_de_estudios es mayor que tres y los ingresos superan
los 28.000 (euros).*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp= false;
		
		System.out.println("edad: ");
		edad=sc.nextInt();
		System.out.println("nivel de estudios: ");
		nivel_de_estudios=sc.nextInt();
		System.out.println("nivel de ingresos: ");
		ingresos=sc.nextInt();
	   jasp	= ((edad<=28) && (nivel_de_estudios>3) && (ingresos>28000));
		System.out.println("eres jasp? "+jasp);
		
		
		
		
		
	}

}
