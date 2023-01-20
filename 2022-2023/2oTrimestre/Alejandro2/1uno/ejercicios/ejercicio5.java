package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
/*Código para calcular el perímetro y el área de un cuadrado midiendo primero su lado(entero)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int lado= 0;
		
		System.out.println("Introduce el valor entero (lado): ");	
		lado= sc.nextInt();
		System.out.println("el perimetro es: "+lado*4);
		System.out.println("el area es: "+lado*lado);
	}

		
		
		
	}


