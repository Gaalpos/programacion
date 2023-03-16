package ejemplo3;

public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

	@Override
	public void Concentrarse() {
		// TODO Auto-generated method stub
		super.Concentrarse();
		System.out.println("El entrenador tiene una habitacion doble ");
	}

	@Override
	public void Viajar() {
		// TODO Auto-generated method stub
		super.Viajar();
		System.out.println("En avion en primera clase");
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]";
	}

}