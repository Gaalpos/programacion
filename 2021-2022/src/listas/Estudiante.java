package listas;

import java.net.URI;
import java.net.URL;

public class Estudiante implements Comparable<Estudiante> {

	String nombre;
	Integer edad;
	URI email;
	


	public Estudiante() {
		
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Estudiante(String nombre, Integer edad, URI email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
		
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public URI getEmail() {
		return email;
	}

	public void setEmail(URI email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "estudiante [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}

	public int compareTo(Estudiante pas) {
		return (this.nombre).compareTo(pas.getNombre());
	}
	
	public boolean equals (Estudiante pas) {
		return (this.nombre).equals(pas);
	}
	
}
