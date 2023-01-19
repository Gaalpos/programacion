package ejemplos;

public class despedirse {

	
private String nombre;
	
	public despedirse(String nombre){
		this.nombre= nombre;
		
	}
	
	public void mostrarAdios() {
		System.out.println("Adiós "+getNombre().toUpperCase());
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
		

	
	
}
