package examenA;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		int año=0;
		boolean bis=false;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escriba un año para saber si es bisiesto");
		año=sc.nextInt();
		
		if(año%4==0) {
			if(año%100==0 && año%400==0) {
				bis=true;
				System.out.println(bis);
			}else {
				System.out.println(bis);
			}
		}else {
			System.out.println(bis);
		}
		sc.close();
	}

}
