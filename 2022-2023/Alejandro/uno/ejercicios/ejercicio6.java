package ejercicios;

import java.util.Scanner;

public class ejercicio6 {
/*Código para calcular el perímetro y el área de un rectángulo midiendo primero sus dos lados(double)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		double  base;
		double altura;
		double perimetro;
		double area;
		System.out.println("Introduce la base: ");	
		base= sc.nextDouble();
		System.out.println("Introduce la altura: ");	
		altura = sc.nextDouble();
		perimetro= (base+altura)*2;
		area= base*altura;
		System.out.println("el perimetro es: "+perimetro);
		System.out.println("el area es: "+area);
	}}
