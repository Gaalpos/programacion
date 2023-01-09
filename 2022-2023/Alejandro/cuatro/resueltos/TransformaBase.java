package resueltos;

import java.util.Scanner;

public class TransformaBase {

	public static void muestraCifra(int dat) {
		
		if(dat<10) {
			System.out.println(dat);
		}else {
			dat-=10;
			char c= (char) ('A'+dat);
			System.out.println(c);
		}
	}
		public static void transforma(int dato, int base) {
			if(base>dato)
				muestraCifra(dato);
			else {
				transforma(dato/base,base);
				muestraCifra(dato%base);
			}
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame un dato: ");
			int dato=sc.nextInt();
			System.out.println("Dame una base: ");
			int base=sc.nextInt();
			
			System.out.println("Transformando a base: "+base);
			System.out.println("el dato: "+dato);
			transforma(dato, base);
			
		}
		
	
	
	
}
