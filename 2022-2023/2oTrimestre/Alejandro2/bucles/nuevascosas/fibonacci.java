package nuevascosas;

import java.util.Scanner;

public class fibonacci {
	
	public static int generaTermino(int termino) {
		
		if(termino==1)
			return 1;
		else if(termino==2)
			return 1;
		else
			return generaTermino(termino-1)+generaTermino(termino-2);
		
	}
	
	
	public static void generaFibo(int contar) {
		
		int a=1;
		int b=1;
		System.out.println("el termino 1 es "+a);
		System.out.println("el termino 2 es "+b);
		int aux=0;
		for(int i=3;i<=contar;i++) {
			System.out.println("el termino "+i+", es "+(a+b));
			aux=b;
			b=a+b;
			a=aux;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Que termino de fibonacci quieres saber?: ");
		int contar=sc.nextInt();
		generaFibo(contar);
		System.out.println("Has listado "+contar+" numeros");
		System.out.println("termino generado por recursividad");
		System.out.println("El termino "+contar+" es: "+generaTermino(contar));
	

		
		
			
		
		
	}

}
