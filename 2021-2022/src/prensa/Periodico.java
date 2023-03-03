package prensa;

public class Periodico extends Publicacion {
	
	public String nombre;
	public String fecha;
	
	
	Periodico (){
		super();
		nombre = null;
		fecha = null;
	}
	
	Periodico( String nombre,String fecha){
		super();
		this.nombre= nombre;
		this.fecha=fecha;
		
	}
	
	Periodico( String nombre,String fecha, int numeroDePaginas, float precio){
		super(numeroDePaginas, precio);
		this.nombre= nombre;
		this.fecha=fecha;
		this.precio=precio;
		
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Periodico [nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	/*
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Periodico [ nombre"+nombre+;
	}
	*/
	
	
	
}
