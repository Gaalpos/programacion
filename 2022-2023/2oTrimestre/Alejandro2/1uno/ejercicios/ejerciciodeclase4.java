package ejercicios;

import java.util.Scanner;

public class ejerciciodeclase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		double discriminante;
		//entradas
		System.out.println("Introduce a: ");
		a= sc.nextDouble();
		System.out.println("Introduce b: ");
		b= sc.nextDouble();
		System.out.println("Introduce c: ");
		c= sc.nextDouble();
		//algoritmo
		discriminante=( Math.pow(b, 2)-4*a*c);
		System.out.println("discriminante: "+discriminante);
		if (discriminante>0) {
			System.out.println("dos raices reales");
			//calculase
			double raiz_1=(-b+Math.sqrt(discriminante))/(2*a);
			double raiz_2=(-b-Math.sqrt(discriminante))/(2*a);
			System.out.println("Raiz 1: "+raiz_1);
			System.out.println("Raiz 2:" +raiz_2);
			}
		else if( discriminante==0) {
			System.out.println("Una raiz repetida");
			//calculase
			double raiz_1=(-b+Math.sqrt(discriminante))/(2*a);
			System.out.println("Raiz 1: "+raiz_1);
			}
		else{System.out.println("NO hay soluciones reales");
		}

	
	}

	

}
