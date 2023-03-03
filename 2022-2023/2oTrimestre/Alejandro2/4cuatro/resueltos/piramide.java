package resueltos;

import java.util.Scanner;

//3.Realiza un programa que utilizando recursividad muestre por pantalla la sigueinte piramide

public class piramide {

	public static int elemento(int filas, int columnas) {
		
		if (columnas==1)
			return 1;
		if (columnas<1 || columnas>filas) 
			return 0;
		return elemento(filas-1, columnas)+ elemento(filas-1, columnas-1);
	}
	
	public static void main(String[] args) {
		
		int numfilas=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas filas: ");
		numfilas=sc.nextInt();
		for(int i=1; i<(numfilas+1); i++) {
		for(int e=0; e<(numfilas-i); e++) {
		System.out.print(" ");
		}
		
		for(int j=1; j<(numfilas+1); j++) {
		int dato=elemento(i,j);
		
		if(dato>0)
			System.out.print(" "+dato+" ");
		else if(dato>9)
			System.out.print(dato+"");
			}
		System.out.println("");
		}
	}
}
