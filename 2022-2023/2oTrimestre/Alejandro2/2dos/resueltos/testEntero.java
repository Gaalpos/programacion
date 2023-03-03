package resueltos;

import java.util.Scanner;

public class testEntero {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        

        Entero uno = new Entero();
        System.out.println("Numero para sumar?");
        aux = sc.nextInt();
        System.out.println("Valor es: " + uno.suma(aux));

        System.out.println("Numero para restar?");
        aux = sc.nextInt();
        System.out.println("Valor es: " + uno.resta(aux));

        System.out.println("El doble es:" + uno.doble());

        System.out.println("El triple es: " + uno.triple());
        
        
        System.out.println("Introduce un valor entero: ");
        int pedido = sc.nextInt();

        Entero dos = new Entero(pedido);
        System.out.println("Numero para sumar?");
        aux = sc.nextInt();
        System.out.println("Valor es: " +uno.suma(aux));

        System.out.println("Numero para restar?");
        aux = sc.nextInt();
        System.out.println("Valor es: " +uno.resta(aux));

        System.out.println("El doble es:" + dos.doble());

        System.out.println("El triple es: " + dos.triple());
    }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


