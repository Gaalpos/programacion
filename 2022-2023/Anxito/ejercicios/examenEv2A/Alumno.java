package examenEv2A;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private double nota;

	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	public int compareTo(Alumno pas) {
		return (this.nombre).compareTo(pas.getNombre());
	}
	
	public int compareTo(Double nota) {
		return Duble.valueOf this.nota.compareTo(nota);
	
	}
}