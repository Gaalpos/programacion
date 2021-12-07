package cap3;

import java.util.Scanner;

/*
 * 5. (Ejercicio de dificultad alta) Se desea conocer el lucky number (número de la suerte) de cualquier persona. El
número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo,
la fecha de nacimiento de Emma es la siguiente: 16-08-1973 — > 16+8+1973 = 1997 — > 1+9+9+7=26 — > 2+6 =8. El
número de la suerte de Emma será el 8.
 */

public class propuesto5 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		int luk=0;
		
		int dia=0;
		int mes=0;
		int ano=0;
		
		
		System.out.println ("introduce el día");
		dia=sc.nextInt();
		System.out.println ("introduce el mes");
		mes=sc.nextInt();
		System.out.println ("introduce el año");
		ano=sc.nextInt();
		
		
		//suma de dd mm aa
		
		n=dia+mes+ano;
		
		System.out.println("Cantidad inicial: "+n);
		
		
	
		
		do {
		
				luk=0;
		//HACE la calcula pre lucky
				while (n > 0) {
					luk += ((int)n%10);
					n = n / 10;	
				}	
				n=luk;
		}while(luk>=10);
				System.out.println("tu número de la suerte es "+luk);
				
			
	}

}
