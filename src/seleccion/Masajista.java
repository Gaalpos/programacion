package seleccion;

public class Masajista extends Seleccion{

	
	String Titulacion;
	private int anosExperiencia;
	
	
	public Masajista() {
		super();
	}
	
	public Masajista(int id, String nombre, String apellidos, int edad, String Titulacion, int anos) {
		super(id,nombre,apellidos,edad);
		this.Titulacion=Titulacion;
		this.anosExperiencia=anos;
	}

	public String getTitulacion() {
		return Titulacion;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	
	public void Concentrarse() {
		//super.Concentrarse();
		System.out.println("Este es el metodo concentrarse de la superclase Masajitsa");
	}

	public void Viajar() {
		//super.Viajar();
		System.out.println("Este es el metodo viajar de la superclase Masajitsa");
	}
	
	public void darMasaje() {
			System.out.println("Masajista dando un masaje");
	}
}
