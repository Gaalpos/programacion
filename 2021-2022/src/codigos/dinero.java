package codigos;

import java.util.Scanner;

public class dinero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		int p = 0;
		int qui = 0;
		int dos = 0;
		int cie = 0;
		int cin = 0;
		int ven = 0;
		int die = 0;
		int fiv = 0;

		System.out.println("introduzca una cantidad a pagar: ");
		p = escaner.nextInt();
		System.out.println("la cantidad es: " + p);
//	/  ENVOLVER EN UN BUCLE while QUE SE REPITE MIENTRAS EL TOTAL SEA...	

		while (p>=5) {
		if (p >= 500) {
			qui++;
			p -= 500;
		} else if (p >= 200) {
			dos++;
			p -= 200;
		} else if (p >= 100) {
			cie++;
			p -= 100;
		} else if (p >= 50) {
			cin++;
			p -= 50;
		} else if (p >= 20) {
			ven++;
			p -= 20;
		} else if (p >= 10) {
			die++;
			p -= 10;
		} else if (p >= 5) {
			fiv++;
			p -= 5;
		}
	} //fin de while
		
		System.out.println(qui+" de quinientos");
		System.out.println(dos+" de doscientos");
		System.out.println(cie+" de cien");
		System.out.println(cin+" de cincuenta");
		System.out.println(ven+" de vente");
		System.out.println(die+" de diez");
		System.out.println(fiv+" de cinco");
		System.out.println(p+" en monedas");
}
}