package seleccion;

public class Seleccion {

	private int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

	public Seleccion() {

	}

	public Seleccion(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void Concentrarse() {
		System.out.println("Este es el metodo concentrarse de la superclase Seleccion");
	}

	public void Viajar() {
		System.out.println("Este es el metodo viajare de la superclase Seleccion");
	}

}
