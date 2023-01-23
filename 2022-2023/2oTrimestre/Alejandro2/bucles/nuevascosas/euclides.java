package nuevascosas;

import java.util.Scanner;

public class euclides {

	
	public static int hallarMCD(int a , int b) {
		int mcd = 0;
		int aux=0;
		while(a%b!=0) {
			
			aux=a;
			a=b;
			b=aux%b;
			
			
		}
		
		mcd=b;
		
		return mcd;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Dame un numero a: ");
		int a = sc.nextInt();
		System.out.println("Dame un numero b: ");
		int b = sc.nextInt();
		
		System.out.println("el mcd es: "+hallarMCD(a,b));
		
	}
	
	
	
	
}
