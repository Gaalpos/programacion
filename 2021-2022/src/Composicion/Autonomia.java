package Composicion;

import java.util.ArrayList;
import java.util.List;

public class Autonomia {
	
	String nombre;
	//formada por una lista de provincias
	List <Provincia> lista;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Provincia> getLista() {
		return lista;
	}
	public void setLista(List<Provincia> lista) {
		this.lista = lista;
	}
	
	
	public Autonomia(String n){
		this.nombre=n;
		this.lista=new ArrayList <Provincia>();
	}
	@Override
	public String toString() {
		return "Autonomia [nombre=" + nombre + ", lista=" + lista + "]";
	}
	
	
}
