package Composicion;

public class Provincia {

	String nombre;
	int poblacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
	Provincia(String n, int p){
		this.nombre=n;
		this.poblacion=p;
		
	}
	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	
	
	
}
