package ejemplos;

import java.util.Scanner;

public class despedirse {

	Scanner sc = new Scanner(System.in);
		
		private String nombre;
		
		public despedirse(String nombre){
			this.nombre=nombre; 
		}
		
		public void mostrarDespedida() {
			System.out.println("ADIOS "+getNombre().toUpperCase());
		}
		
		public String getNombre() {
			return this.nombre;
		}
		
		
	
	
	
}
