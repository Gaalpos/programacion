package repaso;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int a = 0;
		int pos = 0;
		int neg = 0;
		int cont1 = 0;
		int cont2 = 0;
		int ceros=0;

		for (int c = 0; c <= 10; c = c++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			a = sc.nextInt();
			if(a>0) {
				neg=neg+a;
				cont1++;
			}else if(a>0) {
				pos=pos+a;
				cont2++;
			}else {
				ceros++;
			}

		}
		System.out.println("Media de los negativos: "+(neg/cont1));
		System.out.println("Media de los positivos: "+(pos/cont2));
		System.out.println("Ceros: "+ceros);
	}
}
