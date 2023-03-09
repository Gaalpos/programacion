package ejerciciosCadenas;

import java.util.Scanner;
//Comprobar si es capicua.
public class ejercicioB {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String derecha ="";
	String izquierda="";
	
	System.out.println("introduce un numero entero");
	Integer cad = sc.nextInt();
	
	
	derecha= String.valueOf(cad);
	
	System.out.println(derecha);
	
	
	// recorremos la cadena desde el final

	for (int i = derecha.length() - 1; i >= 0; i--) {
		
		izquierda += derecha.charAt(i);
		
	}
	//System.out.println(izquierda);
	
	
	
	if(derecha.equalsIgnoreCase(izquierda))
		System.out.println(cad+" Es CAPICUA");
	else
		System.out.println(cad+" NO es CAPICUA");
	System.out.println("el doble del numero es: "+2*Integer.parseInt(derecha));

	sc.close();
	
	
	
	
	
	
	
}
}

