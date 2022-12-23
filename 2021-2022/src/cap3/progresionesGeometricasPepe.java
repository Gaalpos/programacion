package cap3;

import java.util.Scanner;

public class progresionesGeometricasPepe {

	public static int iteraCF(int i, int r, int n) {
		int algo = i;
		for (int j = 1; j <= n; j++) {
			algo = algo * r;
		}
		return algo;
	}

	public static int iteraFormula(int i, int r, int n) {
		return i * (int) Math.pow(r, n);
	}

	public static int recursivoGeo(int i, int r, int n) {
		if(n==0) {
			return i; 
		}
		else {
			return r*recursivoGeo(i,r,n-1);
		}
	}
	
	public static void main(String[] args) {
		int enesimo = 0;
		int razon = 0;
		int inicio = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("termino inicial (nunca cero): ");
		inicio = sc.nextInt();
		System.out.println("razon (cuanto multiplico cada vez): ");
		razon = sc.nextInt();
		System.out.println("termino a obtener (posicion): ");
		enesimo = sc.nextInt();
		System.out.println("el termino " + enesimo + " es: " +
		recursivoGeo(inicio, razon, enesimo));
		// 3, 6, 12 , 24 , 48 , 96 ,192
	}

}