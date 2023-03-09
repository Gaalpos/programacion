package cap3;
import java.util.Scanner;

public class progresionesaritmeticas1 {

	/*
	 * Rutina recursiva que devuelve el término enésimo de una progresión aritmética
	 */

	public static int pideRecursiva(int t, int r, int n) {
		
		int t_cero = t;
		int raz = r;
		//caso limite
		if(n<=0) {
			return t_cero; //añade el 1
		}
		//ley de recursividad
		else {
			return r + pideRecursiva(t,r,n-1); //llam n veces a sumar r
		}
	}
	
	
	
	public static int pideAritmetica(int t, int r, int n) {
		// PROGRESION Aritmetica termino inicial t
		// razon r.....
		int t_ene = 0;
		int t_cero = t;
		int raz = r;

		t_ene = t_cero + raz * n; /// 

		return t_ene;
	}
		
	public static int terminoIterSF(int numero) {
		// PROGRESION Aritmetica termino inicial 1
		// razon 3 //1,4,7,10,13.....
		int valor = 0;
		int t_cero = 1;
		int raz = 3;

		// con for
		valor = t_cero + raz * numero; /// 1 + 3 * numero

		return valor;
	}
	
	public static int terminoIterCF(int numero) {
		// PROGRESION Aritmetica termino inicial 1
		// razon 3 //1,4,7,10,13.....
		int valor = 0;
		int t_cero = 1;
		int raz = 3;
        //termino cero
		valor=t_cero;
		// y sumar numero veces la razon
		for (int j=1;j <= numero; j++) {
			valor=valor+raz ;
		}
		return valor;
	}

	public static void main(String[] args) {
		
		int enesimo = 0;
		int razon=0;
		int zero=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("termino cero (empieza): ");
		zero = sc.nextInt();
		System.out.println("razon (cuanto sumo de cada vez): ");
		razon = sc.nextInt();
		System.out.println("termino a obtener (posicion): ");
		enesimo = sc.nextInt();
		System.out.println("el termino " + enesimo +
				" es: " + pideRecursiva(zero, razon, enesimo));
			}
}



