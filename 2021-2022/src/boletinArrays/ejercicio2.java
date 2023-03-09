package boletinArrays;

import java.util.Scanner;

public class ejercicio2 {

	
		public static void main(String[] args) {	
			
			Scanner sc=new Scanner(System.in);
			int [] array=new int [5];
			for (int i =0; i<array.length;i++) {
				System.out.println("Intrduce el indice "+i );
				array[i]=sc.nextInt();
			}
			for (int i =array.length-1; i>=0;  i--) {
				System.out.println(" "+array[i]+ " ");
			}
			sc.close();
			
		}
	}

