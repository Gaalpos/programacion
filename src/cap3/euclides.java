package cap3;

import java.util.Scanner;

public class euclides {
	
	public static int mcdR(int n1,int n2) {
		if(n1%n2==0) {
				return n2;
		}else {
			//reasignamos valores
			return mcdR(n2,n1%n2);
		}
	}
	
	public static int mcd(int n1, int n2) {
		boolean salir=false;
		int divid=n1;
		int divis=n2;
		int mcd=1;
		int resto=0;
		
		do {
			resto=divid%divis;
			if(resto==0) {
				salir=true;
				mcd=divis;
			}else {
				divid=divis;
				divis=resto;
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Término A: ");
		n1 = sc.nextInt();
		System.out.println("Término B: ");
		n2 = sc.nextInt();
	
		System.out.println("El máximo comun divisor de "+n1 +" y "+n2+ " es "+mcd(n1,n2));
		System.out.println("El min comun multiplo de "+n1 +" y "+n2+ " es "+mcm(n1,n2));
		System.out.println("El MCD crecursivo de "+n1 +" y "+n2+ " es "+mcdR(n1,n2));
	}
}
