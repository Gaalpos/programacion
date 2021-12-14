package cap3;

import java.util.Scanner;

public class euclides {
	
	public static int mcd(int n1, int n2) {
		boolean salir=false;
		int divid=0;
		int divis=0;
		int mcd=0;
		int resto=0;
		
		
		do {
			System.out.println("Dividendo: "+n1);
			System.out.println("Divisor: "+n2);
			//cociente=divid/divis;
			resto=divid%divis;
			//System.out.println("Cociente: "+cociente);
			System.out.println("Resto: "+resto);
			
			if(resto==0) {
				salir=true;
				mcd=divis;
			}else {
				divid=divis;
				divis=resto;
				System.out.println("Aun no");
			}
		}while(!salir);
		return mcd;
	}
	
	
	public static int mcm(int n1, int n2) {
		//max comun multiplo
		return n1 *n2 /mcd(n1,n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int mcd=1;
		int mcm=1;


		Scanner sc = new Scanner(System.in);

		System.out.println("Término A: ");
		n1 = sc.nextInt();
		System.out.println("Término B: ");
		n2 = sc.nextInt();
	
		mcd=mcd(n1,n2);
		mcm=mcm(n1,n2);
		System.out.println("El máximo comun divisor de "+n1 +" y "+n2+ "es "+mcd);
		System.out.println("El min comun multiplo de "+n1 +" y "+n2+ "es "+mcm);
	}
}
