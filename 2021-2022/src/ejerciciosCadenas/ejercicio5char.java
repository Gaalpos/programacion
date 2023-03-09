package ejerciciosCadenas;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad =sc.nextLine();
		String invertida= " ";
		
		char[] c = cad.toCharArray();
		char[] inv = new char[c.length];
		
		for(int i=cad.length()-1, j=0;i>=0;i--,j++) {
			inv[j]=c[i];
		}
		invertida=String.valueOf(inv);
		System.out.println(Arrays.toString(inv));
	}
}
