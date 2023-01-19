package ejemplos;

import java.util.Scanner;

public class saludar {

	private String nombre;
	
	public saludar(String nombre){
		this.nombre=nombre; 
	}
	
	public void mostrarSaludo() {
		System.out.println("HOLA "+getNombre().toUpperCase());
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
