package propuestos;
/*Realiza un programa con tres variables de tipo entero a, b y c. El programa deberá mostrar por pantalla el valor
menor y mayor.*/
import java.util.Scanner;

public class propuesto1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Valor de a: ");
		a= sc.nextInt();
		System.out.println("Valor de b: ");
		b= sc.nextInt();
		System.out.println("Valor de c: ");
		c= sc.nextInt();
		
		if (a > b) {

			if (a > c) {
				System.out.println("Valor a es el mayor."); // a>b y a>c
				if (c < b) {
					System.out.println("El valor c es el menor."); // a>b>c

				} else {
					System.out.println("El valor b es el menor"); // a>c>b
				}
			}

			else {// c>a
				System.out.println("Valor c es mayor"); // c>a>b
				System.out.println("Valor b es el menor.");

			}

		} else { // b>a

			if (b > c) { // b>a y b>c b es el mayor
				System.out.println("El valor b es mayor.");
				if (c < a) {
					System.out.println("El valor c es el menor."); // b>a>c
				} else {
					System.out.println("El valor a es el menor."); // b>c>a
				}

			} else {
				System.out.println("El valor c es mayor."); // c>b>a
				System.out.println("El valor a es el menor");
			}

		}
}}


