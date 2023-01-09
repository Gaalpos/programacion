package ejercicios;

import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un
número N, y luego ir pidiendo números indicando “mayor” o
“menor” según sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta.*/

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int secreto=0;
		int numero=0;
		int intentos=1;
		
		 secreto= (int) (Math.random() * 100 + 1);
	
		 System.out.println("Adivina el numero: ");
		 numero= sc.nextInt();
		 
 while(intentos<5) {
	
			 intentos++;
			 if(numero>secreto) {
				 System.out.println("El numero es menor");
				 System.out.println("Prueba otro numero: ");
				 numero= sc.nextInt();
			 }
			 else if(numero<secreto){
				 System.out.println("El numero es mayor");
				 System.out.println("Prueba otro numero: ");
				 numero= sc.nextInt();
			 }
			 else {
				 System.out.println("Has acertado");
				 System.out.println("Has usado: "+intentos);
			 }
			 
		 }
	     
 System.out.println("Se han acabado los intentos");
 System.out.println("El numero era: "+secreto);
		 }
		
		 }

	


