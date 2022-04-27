package objetosT333;

public class Comic {
	private final int DIAS_DEF=5;
	private final boolean ENTREGADO_DEF=false; 
	
	String titulo;
	int dias;
	boolean entregado;
	String editorial;
	String autor;
	
	//Un constructor por defecto.
	public Comic() {
		dias=DIAS_DEF;
		entregado=ENTREGADO_DEF;
	}
	
	//Un constructor con el titulo y dias estimadas.
	public Comic(String t, int d) {
		titulo=t;
		dias=d;
		entregado=ENTREGADO_DEF;
	}
	//Un constructor con todos los atributos, excepto de entregado. 
	public Comic(String t, int d, String e, String a) {
		titulo=t;
		dias=d;
		entregado=ENTREGADO_DEF;
		editorial=e;
		autor=a;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Comic [titulo=" + titulo + ", dias=" + dias + ", entregado=" + entregado + ", editorial=" + editorial
				+ ", autor=" + autor + "]";
	}
	
	

}
