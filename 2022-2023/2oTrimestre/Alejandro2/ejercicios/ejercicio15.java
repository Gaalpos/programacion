package ejercicios;

import java.util.Scanner;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años, y
la cantidad de alumnos que miden más de 1.75.*/

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double altura=0;
		int edad=0;
		int masedad=0;
		int masalto=0;
		int contedad=0;
		int contaltura=0;
		int edadtotal=0;
		double alturatotal=0;
		for(int i=1;i<=5;i++) {
			System.out.println("Dame la edad: ");
			edad= sc.nextInt();
			edadtotal+=edad;
			contedad++;
			System.out.println("Dame la altura: ");
			altura= sc.nextDouble();
			alturatotal+=altura;
			contaltura++;
			if(edad>=18){
				masedad++;
			}
			else {
				
			}
			
			if(altura>=1.75) {
				masalto++;
			}
			else {
				
			}

		 }
		System.out.println("La edad media es: "+edadtotal/contedad);
		System.out.println("La altura media es: "+alturatotal/contaltura);
		System.out.println("Mayores de 18: "+masedad);
		System.out.println("Mas altos que 1.75: "+masalto);
		
	}

}
