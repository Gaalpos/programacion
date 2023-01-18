package resueltos;

import java.util.Scanner;

public class multiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero de 1 a 10");
		
		int num= sc.nextInt();*/

		
		for(int num=1;num<=10;num++) {
						System.out.println("Tabla de multiplicar del "+num);
					for(int i=1;i<=5;i++) {
						
						System.out.println(num+" x "+i+" es "+(num*i));
					}//fin for interno
					System.out.println("---------------------------------");
					for(int j=6;j<=10;j++) {
						
						System.out.println(num+" x "+j+" da "+(num*j));
					}//fin for interno
					System.out.println("---------------------------------");
		}//fin for externo
	}

}
