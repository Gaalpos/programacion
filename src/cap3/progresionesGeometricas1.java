package cap3;

import java.util.Scanner;


/*
 * progresion geometrica/7 termino cero razon 2
 * 3,6,12,24,48,96,192
 * for(int j=0; i=3;j<=enesimo;j++,j*=2){
 * System.outprintln("termino de" +j "es" +i)
 */
public class progresionesGeometricas1 {
	
	public static int iteraCF (int i, int r,int n) {
		int a=0;
		for(int j=0; j<=n;j++){
			a=a*r;
		}
		return a;
	}
	
	public static int iteraFormula(int i, int r,int n) {
		return i*(int)Math.pow(r, n);
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
		// TODO Auto-generated method stub

		int enesimo =0;
		int razon=0;
		int inicio=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("termino inicial (nunca cero):");
		inicio=sc.nextInt();
		System.out.println("razón (cuanto multiplico cada vez): ");
		razon=sc.nextInt();
		System.out.println("termino a obtener(posicion)");
		enesimo=sc.nextInt();
		
		System.out.println("el termino "+enesimo+ " es "+iteraFormula(inicio, razon, enesimo));
		sc.close();
		
		System.out.println("el termino "+enesimo+ " es "+iteraCF(inicio, razon, enesimo));
		sc.close();
		
		System.out.println("el termino "+enesimo+ " es "+recursivoGeo(inicio, razon, enesimo));
		sc.close();
	}

}
