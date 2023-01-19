package propuestos;

import java.util.Scanner;

/*(Ejercicio de dificultad alta) Realiza una clase minumero con un método esOmirp que diga si un número es Omirp
o no. Un número es Omirp si es un número primo y, además, al invertir sus dígitos da otro número primo. Por
ejemplo: 7951 y 1597.*/

public class ejercicio10nov {
	
	
	public static int darlleVolta(int n) {
		
		String num= String.valueOf(n);
		StringBuilder dev= new StringBuilder(num);
		String reves= dev.reverse().toString();
		
		return Integer.parseInt(reves);
	}
	
	
	public static int contarCifras(int numero) {
		int cifras=1;
		while (numero>=10) {
			
			numero=numero/10;
			cifras++;
		}
		return cifras;
	}
	
	
	public static int invertirNumero(int n) {
		int inver=0;
		int cifras = contarCifras(n);
		int temp=n;
		int cociente=0;
		int resto=0;
		
		while (cifras>0) {
		
		cociente=temp/10;
		resto=temp%10;
		temp=cociente;
		inver+=resto*Math.pow(10, cifras-1);
		System.out.println("Cociente: "+cociente);
		System.out.println("Resto: "+resto);
		System.out.println("inverso: "+inver);
		cifras--;
		}
		
		return inver;
		
	}
	
	
	public static boolean esPrimo(int n) { 
		int contador=2;
		boolean primus=true;
		
		//Contador no puede ser 1 y no puede ser el numero
		
		while(contador<n && primus) {
			//System.out.println(contador);
			if(n%contador==0) {
				primus=false;
				
			}
			contador++;
			
			
		}
		return primus;
	}
	
	public static String esOmirp(int n) {
		
		//System.out.println("el numero "+n+" es primo: "+esPrimo(n));
		int p= darlleVolta(n);
		//System.out.println("El numero al reves es: "+p+" es primo: "+esPrimo(p));
		if (esPrimo(n)&& esPrimo(p))
			return "los numeros "+n+" y "+p+" son Omirp";
		else return "NA DE NA";
	}
	
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("dame un numero");
	int n= sc.nextInt();
	int resultado= invertirNumero(n);
	System.out.println(resultado);
	
	
}
}


