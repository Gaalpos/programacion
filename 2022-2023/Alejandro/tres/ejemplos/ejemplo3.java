package ejemplos;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Introducir nº entre el 1 y el 12 e indique cuantos dias tiene el mes seleccionado
		
		Scanner manolin=new Scanner(System.in);
		System.out.println("Introduce el nº del mes del año para saber nº de días");
		int mes=manolin.nextInt();
		if(mes<=12 && mes>=1)
		switch(mes) {
	
		case 1,3,5,7,8,10,12:
			System.out.println("Su mes tiene 31 días");
		break;
		
		case 4,6,9,11:
			System.out.println("Su mes tiene 30 días");
			break;
		
		case 2:
			System.out.println("Su mes tiene 28 días");
			break;
		
		}else {
			System.out.println("El nº introducido no corresponde a un mes, por favor introduzca un nº del 1 al 12");
				
			}
		
		}
		
		
		
		
		
		
		
		
		
	}


