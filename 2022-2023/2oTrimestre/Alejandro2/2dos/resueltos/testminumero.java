package resueltos;

import java.util.Scanner;

public class testminumero {
    
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double aux=0d;
        double aux2=0;
		int opcion;
		System.out.println("pulsa 1 para conocer doble,triple y cuadruple");
		System.out.println("pusla 2 para escoger la multiplicación que deseas");
		opcion= sc.nextInt();
		
		//Probamos el constructor
		if(opcion==1) {
			System.out.println("Introduce el numero a multiplicar");
			aux=sc.nextDouble();
			
			minumero uno= new minumero(aux);
			System.out.println("El doble es:" +uno.doble() );
			System.out.println("El triple es: "+uno.triple());
			System.out.println("El quádruple es: "+uno.cuadruple());
			}

        
		//probamos el constructor pasando el cambio que queramos
		else {
			System.out.println("Introduce el numero a multiplicar");
			aux=sc.nextDouble();
			System.out.println("Introduce el numero por el que multiplicar");
			aux2=sc.nextDouble();
			minumero uno= new minumero(aux);
			System.out.println("El resultado es:" +uno.multiplicacion(aux2) );
			
			}
		
		
		
	}}
