package cap3;

import java.util.Scanner;

public class propuesto10Vampiro {


	public static boolean esVampiro(int numero) {
		boolean vampiro=false;
		int a,b,c,d;
		int aux1,aux2;
		
		a = numero / 1000;
		b = (numero / 100) % 10;
		c = (numero / 10) % 10;
		d = numero % 10;
		aux1=a*10+b;
		aux2=c*10+d;
		
		if(aux1==aux2) {
			vampiro=true;
		}else {
			vampiro=false;
		}
		return vampiro;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		System.out.println("Escribe un número de 4 cifras");
		a=sc.nextInt();
		System.out.println(esVampiro(a));

	}

}
