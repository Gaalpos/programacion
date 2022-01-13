package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class especialEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [] inversos = new int[10];
		
		
		for(int k = 10; k >= inversos.length;k--) {
		int c=0;
		System.out.println("Escribe el número "+k);
		inversos[c]=sc.nextInt();
		k--;
		}
		
		System.out.println(Arrays.toString(inversos));
	}

}
