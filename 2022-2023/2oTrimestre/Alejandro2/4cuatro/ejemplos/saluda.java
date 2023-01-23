package ejemplos;

import java.util.Scanner;

public class saluda {
	
	
	private String nombre;
	
	public saluda(String nombre){
		this.nombre= nombre;
		
	}
	
	public void mostrarSaludo() {
		System.out.println("Hola "+getNombre().toUpperCase());
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	
}
