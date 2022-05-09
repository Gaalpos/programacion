package prensa;

public class Publicacion {
	
	protected int numeroDePaginas;
	protected float precio;
	
	public int getNumeroDePAginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePAginas(int numeroDePaginas) {
		numeroDePaginas = numeroDePaginas;
	}
	public float getPrecio() {
		return this.precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	//constructores
	Publicacion(){
		numeroDePaginas =0;
		precio=0f;
	}

	
	Publicacion(int numeroDePaginas){
		setNumeroDePAginas(numeroDePaginas);
	}
	
	Publicacion(float precio){
		setPrecio(precio);
	}
	
	
	Publicacion (int numeroDePaginas, float precio){
		this(numeroDePaginas);
		setPrecio(precio);
	}
	
	Publicacion ( float precio, int numeroDePaginas){
		this(numeroDePaginas,precio);
	}
	@Override
	public String toString() {
		return "Publicacion [numeroDePaginas=" + numeroDePaginas + ", precio=" + precio + "]";
	}
	
	
}
