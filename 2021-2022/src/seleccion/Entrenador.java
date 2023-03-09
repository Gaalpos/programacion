package seleccion;

public class Entrenador extends Seleccion {
	private String idFederacion;

	public Entrenador() {

	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion ) {
		super(id,nombre,apellidos,edad);
		this.idFederacion=idFederacion;
	}
	
	public String getIdFederacion() {
		return idFederacion;
	}
	
	
	
	public void Concentrarse() {
		super.Concentrarse();
		System.out.println("Este es el metodo concentrarse de la superclase Entrenador");
	}

	public void Viajar() {
		super.Viajar();
		System.out.println("Este es el metodo viajar de la superclase Entrenador");
	}
	
	public void dirigirPartido() {
		System.out.println("Entrenador dirige un partido");
	}
	
	public void dirigirEntreno() {
		System.out.println("Entrenador dirige un entrenamiento");
	}
}
