package cap3;

import java.util.Scanner;

/*  El factorial de un entero positivo n o el factorial de n se define
 *  como el producto de todos los números enteros positivos desde el propio
 *  numero hasta 1. Por ejemplo:
 *  5! = 5*4*3*2*1 = 120
 *  3! = 3*2*1 = 6
 *  
 *  SUPER OJO 1!=1
 *  SUPER OJISIMO 0!= 1 ************
 *  
 *  5! = 5*  (4*3*2*1)       = 120
 *  5! = 5*  4!    -> recursividad          = 120
 *  
 *  4! = 4 * (3*2*1)         = 24
 *  4! = 4 * 3!    -> recursividad          = 24
 *  
 *  3! = 3*  (2*1)           = 6
 *  3! = 3*  2!     -> recursividad         = 6
 *  
 *  2! = 2* 1                = 2
 *  2! = 2* 1!      -> recursividad         = 2  
 *  
 *  1! = 1    ---->   caso limite o caso finito           
 *  
 */


public class factorialRecursiva {

	public static int factorialIterativo(int n) {
		int fac=1;
		for(int i=n;i>=1;i=i-1) {
			fac=fac*i;
			//System.out.println("acumulado: "+fac);
		}
		return fac;
		}

	//calculo del factorial por recursividad
	public static int factR(int n) {
		int fac=1;
		
		if(n<1)
			return fac;  //caso finito
		else
			return fac=n*factR(n-1);  //ley de recursividad
		}
	
	
	public static void main(String[] args) {
	
		int n=0;
		Scanner pide = new Scanner(System.in);
		System.out.println("introduce un entero (bajito): ");
		n=pide.nextInt();
		//System.out.println("factorial de "+n+" es: "+factorialIterativo(n));
		System.out.println("factorial de "+n+" es: "+factR(n));
	}
	
	
}