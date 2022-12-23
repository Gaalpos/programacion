import java.util.Scanner;

/* Programar un algoritmo recursivo que permita
 * invertir un número. 
 * Ejemplo: Entrada: 1234 Salida: 4321
 */
public class ejercicio3B {

	
	 public static int cuentaDigitos(int num) {
		int cont = 0;
		while (num != 0) {
			num /= 10;
			cont++;
		}
		return cont;
	}
	
	 public static int inversaDigitos(int numero) {
		    
	        //condicion limite numero menor que 10.
	        if (numero<10) {
	        	return numero;
	        	}
	        else {     		
	        	//System.out.println(inversaDigitos(numero));
	            return  (int) (Math.pow(10, cuentaDigitos(numero) - 1) * (numero % 10) + inversaDigitos(numero / 10))    ;
	        }
	    }

	    public static void main(String[] args) {

	    	int numero=0;
	    	Scanner sc = new Scanner (System.in);
	    	System.out.println("dame numero: ");
	        numero=sc.nextInt();
	    	
	    	System.out.println(inversaDigitos(numero));

	    }
	
	
}
