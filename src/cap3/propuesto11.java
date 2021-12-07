package cap3;

/*
 * 11. Realiza un programa que muestre por pantalla los 50 primeros números pares.
 */

public class propuesto11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		int cont1=0;
		int cont2=0;
		/*
		for(int i=0; i<=100;i=i+2) {
			System.out.println(i);
		}
		*/
		
		
		
		/*
		for (int i=1; i<=100; i=i+3) {
			System.out.println(i);
			cont++;
		}
		System.out.println("has imperso "+cont+ " números");
		*/
		
		for (int i=99; i>0; i=i-4) {
			System.out.println(i);
			cont1++;
		}
		System.out.println("has imperso "+cont1+ " números");
		
		for (int i=12; i>100; i=i+5) {
			System.out.println(i);
			cont2++;
		}
		System.out.println("has imperso "+cont1+ " números");
		
	}

}
