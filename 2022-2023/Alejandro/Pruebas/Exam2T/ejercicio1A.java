package Pruebas.Exam2T;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio1A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		//declaramos un mapa
		HashMap<Integer, Character> m = new HashMap<Integer,Character>();
		
		//metodo para añadir parejas al map
		m.put(0, 'T');
		m.put(1, 'R');
		m.put(2, 'W');
		m.put(3, 'A');
		m.put(4, 'G');
		m.put(5, 'M');
		m.put(6, 'Y');
		m.put(7, 'F');
		m.put(8, 'P');
		m.put(9, 'D');
		m.put(10, 'X');
		m.put(11, 'B');
		m.put(12, 'N');
		m.put(13, 'J');
		m.put(14, 'Z');
		m.put(15, 'S');
		m.put(16, 'Q');
		m.put(17, 'V');
		m.put(18, 'H');
		m.put(19, 'L');
		m.put(20, 'C');
		m.put(21, 'K');
		m.put(22, 'E');

        System.out.println("Introduce DNI sin la letra: ");
        int dniSinLetra=sc.nextInt();
        int resultado =dniSinLetra%23;
        System.out.println("La letra es: "+m.get(resultado));
        System.out.println("El DNI completo es: "+dniSinLetra+m.get(resultado));
        
    }
}
