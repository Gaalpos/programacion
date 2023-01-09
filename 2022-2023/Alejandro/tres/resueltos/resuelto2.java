package resueltos;

import java.util.Scanner;

public class resuelto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantas filas quieres?: ");
		filas=sc.nextInt();
		
		
		
		int i,j,k;
		for (i=1;i<=filas;i++){ //bucle que cuenta hasta 10
			for (k=1;k<=filas-i;k++) {
			System.out.print(" ");
			}
			for (j=1;j<=2*(i-1)+1;j++){
			System.out.print("*");
			}
			System.out.println("");
			}
		//Fin del for externo
		
		
	}

}
